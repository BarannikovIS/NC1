package com.mycompany.project1abstractclassandinterface;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

/**
 *
 * @author Иван
 */
public class XMLClass {

    public static void createXML(ArrayList<Figure> figures) {
        Element root = new Element("ListFigures");
        Document doc = new Document(root);
        for (Figure f : figures) {
            Element figure = new Element("figure");
            figure.setAttribute("name", f.getClass().getSimpleName());
            figure.addContent(new Element("X").addContent(String.valueOf(f.getX())));
            figure.addContent(new Element("Y").addContent(String.valueOf(f.getY())));
            figure.addContent(new Element("Area").addContent(String.valueOf(f.calculateTheArea())));
            figure.addContent(new Element("Perimetr").addContent(String.valueOf(f.calculateThePerimetr())));
            if (f instanceof Rectangle) {
                figure.addContent(new Element("Width").addContent(String.valueOf(((Rectangle) f).getWidth())));
                figure.addContent(new Element("Height").addContent(String.valueOf(((Rectangle) f).getHeight())));
            }
            if (f instanceof Circle) {
                figure.addContent(new Element("Radius").addContent(String.valueOf(((Circle) f).getR())));
            }
            root.addContent(figure);
        }

        XMLOutputter outputter = new XMLOutputter();
        outputter.setFormat(Format.getPrettyFormat());
        try {
            outputter.output(doc, new FileOutputStream("ListFigures.xml"));
        } catch (IOException io) {
            System.out.println(io.getMessage());
        }
    }

    public static void parsingXML(String path) {
        SAXBuilder builder = new SAXBuilder();
        File xmlFile = new File(path);

        try {
            Document doc = (Document) builder.build(xmlFile);
            Element root = doc.getRootElement();
            List figures = root.getChildren("figure");

            for (int i = 0; i < figures.size(); i++) {
                Element figure = (Element) figures.get(i);
                System.out.println("Name is : " + figure.getAttributeValue("name"));
                System.out.println("Coordinate x : " + figure.getChildText("X"));
                System.out.println("Coordinate y : " + figure.getChildText("Y"));
                System.out.println("Area is : " + figure.getChildText("Area"));
                System.out.println("Perimetr is : " + figure.getChildText("Perimetr"));
                if (figure.getAttributeValue("name").equals("Rectangle")) {
                    System.out.println("Width is : " + figure.getChildText("Width"));
                    System.out.println("Height is : " + figure.getChildText("Height"));
                }
                if (figure.getAttributeValue("name").equals("Circle")) {
                    System.out.println("Radius is : " + figure.getChildText("Radius"));
                }
            }
        } catch (IOException io) {
            System.out.println(io.getMessage());
        } catch (JDOMException jdomex) {
            System.out.println(jdomex.getMessage());
        }
    }

    public static void XPath(String path) {
        
    }
}

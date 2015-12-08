package com.mycompany.project1abstractclassandinterface;

import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Иван
 */
public class Test {

    public static void main(String[] args) {

        ArrayList<Figure> figures = new ArrayList<Figure>();
        Circle c = new Circle(10, 10, 30);
        Rectangle r1 = new Rectangle(5, 5, 15, 20);
        Rectangle r2 = new Rectangle(10, 10, 5, 5);
        figures.add(c);
        figures.add(r1);
        figures.add(r2);

        //XMLClass.createXML(figures);
        XMLClass.parsingXML("ListFigures.xml");
        XPathMethod("ListFigures.xml");

    }

    public static void XPathMethod(String xmlPath) {
        try {
            DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
            domFactory.setNamespaceAware(true);
            DocumentBuilder builder = domFactory.newDocumentBuilder();
            Document doc = builder.parse(xmlPath);

            XPathFactory factory = XPathFactory.newInstance();
            XPath xpath = factory.newXPath();
            XPathExpression expression = xpath.compile("//figure[X='10']/Area/text()");//Площадь фигур с X=10

            Object result = expression.evaluate(doc, XPathConstants.NODESET);
            NodeList nodes = (NodeList) result;
            for (int i = 0; i < nodes.getLength(); i++) {
                System.out.println("XPath result : " + nodes.item(i).getNodeValue());
            }
        } catch (ParserConfigurationException ex) {
            ex.printStackTrace();
        } catch (SAXException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (XPathExpressionException ex) {
            ex.printStackTrace();
        }
    }
}

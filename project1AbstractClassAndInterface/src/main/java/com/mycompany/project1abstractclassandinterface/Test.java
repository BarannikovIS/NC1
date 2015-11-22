
package com.mycompany.project1abstractclassandinterface;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Иван
 */
public class Test {
    
    public static void main(String[] args) {
        ArrayList<Figure> figures=new ArrayList<Figure>();
                Circle c= new Circle(10,10,30);
                Rectangle r= new Rectangle(5,5,15,20);
                figures.add(c);
                figures.add(r);
                Random rnd = new Random();
                
                for(int i=0;i<figures.size();i++){
                    
                    System.out.println("Coordinates were: "+figures.get(i).getX()+" "+ figures.get(i).getY());
                    System.out.println("Area: "+figures.get(i).calculateTheArea());
                    System.out.println("Perimetr: "+figures.get(i).calculateThePerimetr());
                    
                    figures.get(i).move(rnd.nextInt(10),rnd.nextInt(10));
                    System.out.println("moved in x and y. coordinates steel: "+figures.get(i).getX()+" "+ figures.get(i).getY());
                }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project1abstractclassandinterface;

import java.util.ArrayList;

/**
 *
 * @author Иван
 */
public class Test {
    public static void main(String[] args){
        
                ArrayList<Figure> figures=new ArrayList<Figure>();
                Circle c= new Circle(10,10,30);
                Rectangle r= new Rectangle(5,5,15,20);
                figures.add(c);
                figures.add(r);
                
                for(int i=0;i<figures.size();i++){
                    
                    System.out.println("координаты были: "+figures.get(i).getX()+" "+ figures.get(i).getY());
                    System.out.println("площадь: "+figures.get(i).calculateTheArea());
                    System.out.println("периметр: "+figures.get(i).calculateThePerimetr());
                    
                    figures.get(i).move(10, 10);
                    System.out.println("переместили на 10 по x и y. координаты стали: "+figures.get(i).getX()+" "+ figures.get(i).getY());
                }
             
	}
}

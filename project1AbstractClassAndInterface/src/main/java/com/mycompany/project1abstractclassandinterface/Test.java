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
                
                //список для перемещаемых фигур
                ArrayList<Figure> moveFigures= new ArrayList<Figure>();
                
                Rectangle r = new Rectangle(5,5,10,20);
                Circle c= new Circle(10,10,30);
                
                moveFigures.add(r);
                moveFigures.add(c);
                
                for(int i=0;i<moveFigures.size();i++){
                    //if(moveFigures.get(i) instanceof Figure)
                    System.out.println("координаты были: "+moveFigures.get(i).getX()+" "+ moveFigures.get(i).getY());
                    System.out.println("площадь: "+moveFigures.get(i).calculateTheArea());
                    System.out.println("периметр: "+moveFigures.get(i).calculateThePerimetr());
                    
                    moveFigures.get(i).move(10, 10);
                    System.out.println("переместили на 10 по x и y. координаты стали: "+moveFigures.get(i).getX()+" "+ moveFigures.get(i).getY());
                }
	}
}

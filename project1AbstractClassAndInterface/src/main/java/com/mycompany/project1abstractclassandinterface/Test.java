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
                //список для фигур
                ArrayList<Figure> figures= new ArrayList<Figure>();
                //список для перемещаемых объектов
                ArrayList<IMovement> moveObject= new ArrayList<IMovement>();
                
                Rectangle r = new Rectangle(5,5,10,20);
                Circle c= new Circle(10,10,30);
                Photo p = new Photo(1,1);
                
                figures.add(r);
                figures.add(c);
                
                moveObject.add(c);
                moveObject.add(p);
                //moveObject.add(r); ошибка т.к Rectangle не реализует интерфейс IControl
	}
}

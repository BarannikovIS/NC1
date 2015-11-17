/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project1abstractclassandinterface;

/**
 *
 * @author Иван
 */
public class Rectangle extends Figure{
    private int width,height;
    public Rectangle(int x,int y, int width, int height){
        super(x,y);
        this.width=width;
        this.height=height;
    }
    @Override
    public double calculateTheArea(){
        return width*height;
    }
    @Override
    public double calculateThePerimetr(){
        return 2*(width+height);
    }
}

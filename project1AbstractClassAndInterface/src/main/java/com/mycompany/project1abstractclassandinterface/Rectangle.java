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
    public int getWidth(){
        return width;
    }
    public void setWidth(int value){
        width=value;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int value){
        height=value;
    }
    @Override
    public int calculateTheArea(){
        return getWidth()*getHeight();
    }
    @Override
    public int calculateThePerimetr(){
        return 2*(getWidth()+getHeight());
    }
}

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
public class Circle extends Figure {
    private int r;
    public Circle(int x,int y, int r){
        super(x,y);
        this.r=r;
    }
    @Override
    public int calculateTheArea(){
        return (int)(Math.PI*r*r);
    }
    @Override
    public int calculateThePerimetr(){
        return (int)(2*Math.PI*r);
    }
}

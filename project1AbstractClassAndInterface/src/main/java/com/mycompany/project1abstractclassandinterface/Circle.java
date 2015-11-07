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
public class Circle extends Figure implements IMovement{
    private int r;
    public Circle(int x,int y, int r){
        super(x,y);
        this.r=r;
    }
    public int getR(){
        return r;
    }
    @Override
    public double calculateTheArea(){
        return Math.PI*r*r;
    }
    @Override
    public double calculateThePerimetr(){
        return 2*Math.PI*r;
    }
    @Override
    public void move(int dx, int dy){
        x+=dx;
        y+=dy;
    }
}

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
public abstract class Figure {
    protected int x,y;
    public Figure(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public abstract double calculateTheArea();
    public abstract double calculateThePerimetr();
}

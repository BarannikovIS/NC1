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
public class Photo implements IMovement {
    private int x, y;
    
    public Photo(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    @Override
    public void move(int dx, int dy){
        x+=dx;
        y+=dy;
    }
}

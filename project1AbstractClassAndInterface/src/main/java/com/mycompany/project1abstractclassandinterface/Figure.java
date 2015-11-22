/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project1abstractclassandinterface;

import org.apache.log4j.Logger;

/**
 *
 * @author Иван
 */
public abstract class Figure implements IMovement{
    private static final Logger LOG = Logger.getLogger(Figure.class);
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
    public abstract int calculateTheArea();
    public abstract int calculateThePerimetr();
    @Override
    public void move(int dx,int dy){
        x+=dx;
        y+=dy;
        LOG.info("figure moved in x: "+dx+"; "+"figure moved in y: "+dy);
    }
}

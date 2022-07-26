/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FractPack;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

/**
 *
 * @author Marina Nik
 */

public class FeatherFractalMaker {
    private final double xA;
    private final double yA;
    private final double xB;
    private final double yB;
    //private Graphics2D graphic;
    
    public FeatherFractalMaker(double XA, double YA, double XB, double YB){
        xA = XA;
        yA = YA;
        xB = XB;
        yB = YB;
        //graphic = g;
    }
    
//    public Graphics2D drawLine(){
//        Line2D.Double line = new Line2D.Double(xA, yA, xB, yB);
//        graphic.setColor(Color.BLACK);
//        graphic.draw(line);
//        return graphic;
//    }
    
    public double getXA(){
        return Double.valueOf(xA);
    }
    
    public double getXB(){
        return Double.valueOf(xB);
    }
    
    public double getYA(){
        return Double.valueOf(yA);
    }
    
    public double getYB(){
        return Double.valueOf(yB);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_richardson_wilfredo;

import java.awt.Color;

/**
 *
 * @author RALC
 */
public class Errores extends Exception{
    //private final Color color;
    private Color color;

    public Errores(String string) {
        super(string);
        this.color = Color.blue;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "JAMÄS\n";
    }

    
    
    
    
}

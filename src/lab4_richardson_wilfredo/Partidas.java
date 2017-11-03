/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_richardson_wilfredo;

import java.util.ArrayList;

/**
 *
 * @author RALC
 */
public class Partidas {
    private ArrayList Jugadas = new ArrayList();

    public Partidas() {
    }

    public ArrayList getJugadas() {
        return Jugadas;
    }

    public void setJugadas(ArrayList Jugadas) {
        this.Jugadas = Jugadas;
    }

    @Override
    public String toString() {
        //return "Partidas" + "Jugadas " + Jugadas + '}';
        String x = "";
        for (Object t : Jugadas) {
            x += t +"\n";
        }
        return x;
    }
    
    
    
}

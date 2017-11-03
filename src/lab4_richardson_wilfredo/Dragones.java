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
public class Dragones extends Guerreros{
    private String Color;
    private String Raza;

    public Dragones() {
        super();
    }

    public Dragones(String Color, String Raza) {
        super();
        this.Color = Color;
        this.Raza = Raza;
    }

    public Dragones(String Color, String Raza, String Nombre, int Edad, String LugarNacimiento, int PoderAtaque, int Salud, int Costo) {
        super(Nombre, Edad, LugarNacimiento, PoderAtaque, Salud, Costo);
        this.Color = Color;
        this.Raza = Raza;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    @Override
    public String toString() {
        return "Dragones{" + "Color=" + Color + ", Raza=" + Raza + '}';
    }

    @Override
    public ArrayList<Jugadores> Atacar(int jud, ArrayList<Jugadores> Jugadores) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double salud = Jugadores.get(jud).getGuerrero().getSalud();
        int ataq2 = Jugadores.get(jud).getGuerrero().getPoderAtaque();
        ataq2 = ataq2 - (int)(ataq2 *0.25);
        Jugadores.get(jud).getGuerrero().setPoderAtaque(ataq2);
        int jud2;
        if (jud ==0) {
            jud2 = 1;
        }else{
            jud2 = 0;
        }
        double ataq1 = Jugadores.get(jud2).getGuerrero().getPoderAtaque();
        salud = salud - ataq1;
        if (salud <= 0) {
            Jugadores.get(jud).getGuerrero().setSalud(0);
            System.out.println("\u001b[31m La salud del contrario: "+ 0 +"\u001b[0m" );
            
        }else{
            Jugadores.get(jud).getGuerrero().setSalud(((int)salud));
            System.out.println("\u001b[31m La salud del contrario: "+ salud +"\u001b[0m" );
        }
        //Jugadores.get(jud).getGuerrero().setSalud(((int)salud));
        //System.out.println("\u001b[31m La salud del contrario: "+ salud +"\u001b[0m" );
        System.out.println("\u001b[31m El poder de  ataque del contrincante es: "+ ataq2 +"\u001b[0m" );
        return Jugadores;
    }
    
    
    
}

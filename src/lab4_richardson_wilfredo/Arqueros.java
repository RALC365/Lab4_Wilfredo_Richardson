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
public class Arqueros extends Guerreros{
    private String MaterialArco;
    private String MaterialArmadura;

    public Arqueros() {
        super();
    }

    public Arqueros(String MaterialArco, String MaterialArmadura) {
        super();
        this.MaterialArco = MaterialArco;
        this.MaterialArmadura = MaterialArmadura;
    }

    public Arqueros(String MaterialArco, String MaterialArmadura, String Nombre, int Edad, String LugarNacimiento, int PoderAtaque, int Salud, int Costo) {
        super(Nombre, Edad, LugarNacimiento, PoderAtaque, Salud, Costo);
        this.MaterialArco = MaterialArco;
        this.MaterialArmadura = MaterialArmadura;
    }

    public String getMaterialArco() {
        return MaterialArco;
    }

    public void setMaterialArco(String MaterialArco) {
        this.MaterialArco = MaterialArco;
    }

    public String getMaterialArmadura() {
        return MaterialArmadura;
    }

    public void setMaterialArmadura(String MaterialArmadura) {
        this.MaterialArmadura = MaterialArmadura;
    }

    @Override
    public String toString() {
        return "Arqueros" + "MaterialArco=" + MaterialArco + ", MaterialArmadura=" + MaterialArmadura + '}';
    }

    @Override
    public ArrayList<Jugadores> Atacar(int jud, ArrayList<Jugadores> Jugadores) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools
        double salud = Jugadores.get(jud).getGuerrero().getSalud();
        int jud2;
        if (jud ==0) {
            jud2 = 1;
        }else{
            jud2 = 0;
        }
        //\u001b[31m             \u001b[0m
        
        double ataq1 = Jugadores.get(jud2).getGuerrero().getPoderAtaque();
        salud = salud - ataq1;
        if (salud <= 0) {
            Jugadores.get(jud).getGuerrero().setSalud(0);
            System.out.println("\u001b[31m La salud del contrario: "+ 0 +"\u001b[0m" );
            
        }else{
            Jugadores.get(jud).getGuerrero().setSalud(((int)salud));
            System.out.println("\u001b[31m La salud del contrario: "+ salud +"\u001b[0m" );
        }
        
        
        
        
        int salud2 = Jugadores.get(jud2).getGuerrero().getSalud();
        salud2 += 10;
        System.out.println("\u001b[31m La salud del arquero es: "+ salud2 +"\u001b[0m" );
        Jugadores.get(jud).getGuerrero().setSalud(salud2);
        return Jugadores;
    }

    
    
    
}

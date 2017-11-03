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
public class Brujas extends Guerreros{
    private int SigloNacimiento;
    private String LugarResidencia;

    public Brujas() {
        super();
    }

    public Brujas(int SigloNacimiento, String LugarResidencia) {
        super();
        this.SigloNacimiento = SigloNacimiento;
        this.LugarResidencia = LugarResidencia;
    }

    public Brujas(int SigloNacimiento, String LugarResidencia, String Nombre, int Edad, String LugarNacimiento, int PoderAtaque, int Salud, int Costo) {
        super(Nombre, Edad, LugarNacimiento, PoderAtaque, Salud, Costo);
        this.SigloNacimiento = SigloNacimiento;
        this.LugarResidencia = LugarResidencia;
    }

    public int getSigloNacimiento() {
        return SigloNacimiento;
    }

    public void setSigloNacimiento(int SigloNacimiento) {
        this.SigloNacimiento = SigloNacimiento;
    }

    public String getLugarResidencia() {
        return LugarResidencia;
    }

    public void setLugarResidencia(String LugarResidencia) {
        this.LugarResidencia = LugarResidencia;
    }

    @Override
    public String toString() {
        return "Brujas{" + "SigloNacimiento=" + SigloNacimiento + ", LugarResidencia=" + LugarResidencia + '}';
    }

    @Override
    public void Atacar(int jud, ArrayList<Jugadores> Jugadores) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double salud = Jugadores.get(jud).getGuerrero().getSalud();
        int jud2;
        if (jud ==0) {
            jud2 = 1;
            //jud = 1;
        }else{
            jud2 = 0;
            //jud =0;
        }
        double ataq1 = Jugadores.get(jud).getGuerrero().getPoderAtaque();
        salud = salud - ataq1;
        Jugadores.get(jud).getGuerrero().setSalud(((int)salud));
        System.out.println("\u001b[31m La salud del contrario: "+ salud +"\u001b[0m" );
        //int ataq2 = Jugadores.get(jud2).getGuerrero().getPoderAtaque();
        //ataq2 = ataq2 + 50;
        Jugadores.get(jud).getGuerrero().setPoderAtaque(((int)ataq1)+50);
        System.out.println("\u001b[31m El poder de ataque del contrario: "+ ataq1 + 50 +"\u001b[0m" );
    }
    
    
    
    
}

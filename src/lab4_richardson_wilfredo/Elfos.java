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
public class Elfos extends Guerreros{
    private String TipoArma;
    private String RangoMilitar;

    public Elfos() {
        super();
    }

    public Elfos(String TipoArma, String RangoMilitar) {
        super();
        this.TipoArma = TipoArma;
        this.RangoMilitar = RangoMilitar;
    }

    public Elfos(String TipoArma, String RangoMilitar, String Nombre, int Edad, String LugarNacimiento, int PoderAtaque, int Salud, int Costo) {
        super(Nombre, Edad, LugarNacimiento, PoderAtaque, Salud, Costo);
        this.TipoArma = TipoArma;
        this.RangoMilitar = RangoMilitar;
    }

    public String getTipoArma() {
        return TipoArma;
    }

    public void setTipoArma(String TipoArma) {
        this.TipoArma = TipoArma;
    }

    public String getRangoMilitar() {
        return RangoMilitar;
    }

    public void setRangoMilitar(String RangoMilitar) {
        this.RangoMilitar = RangoMilitar;
    }

    @Override
    public String toString() {
        return "Elfos{" + "TipoArma=" + TipoArma + ", RangoMilitar=" + RangoMilitar + '}';
    }

    @Override
    public void Atacar(int jud, ArrayList<Jugadores> Jugadores) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double salud = Jugadores.get(jud).getGuerrero().getSalud();
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
    }
    
    
    
    
}

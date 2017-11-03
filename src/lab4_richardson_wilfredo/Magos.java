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
public class Magos extends Guerreros{
    private String TipoMagia;
    private String ElementoFavorito;

    public Magos() {
        super();
    }

    public Magos(String TipoMagia, String ElementoFavorito) {
        super();
        this.TipoMagia = TipoMagia;
        this.ElementoFavorito = ElementoFavorito;
    }

    public Magos(String TipoMagia, String ElementoFavorito, String Nombre, int Edad, String LugarNacimiento, int PoderAtaque, int Salud, int Costo) {
        super(Nombre, Edad, LugarNacimiento, PoderAtaque, Salud, Costo);
        this.TipoMagia = TipoMagia;
        this.ElementoFavorito = ElementoFavorito;
    }

    public String getTipoMagia() {
        return TipoMagia;
    }

    public void setTipoMagia(String TipoMagia) {
        this.TipoMagia = TipoMagia;
    }

    public String getElementoFavorito() {
        return ElementoFavorito;
    }

    public void setElementoFavorito(String ElementoFavorito) {
        this.ElementoFavorito = ElementoFavorito;
    }

    @Override
    public String toString() {
        return "Magos{" + "TipoMagia=" + TipoMagia + ", ElementoFavorito=" + ElementoFavorito + '}';
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
        double ataq2 = (Jugadores.get(jud).getGuerrero().getPoderAtaque())/2;
        salud = salud - ataq1 - ataq2;
        Jugadores.get(jud).getGuerrero().setSalud(((int)salud));
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_richardson_wilfredo;

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
    
    
    
    
}

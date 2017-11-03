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
    
    
    
}

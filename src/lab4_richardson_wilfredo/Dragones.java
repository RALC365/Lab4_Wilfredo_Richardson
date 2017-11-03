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
    
    
    
}

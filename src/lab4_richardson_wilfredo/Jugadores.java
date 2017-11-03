
package lab4_richardson_wilfredo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Jugadores {
    public String Nombre;
    public int DineroDisponible;
    public int Puntos;
    public Guerreros Guerrero;

    public Jugadores() {
    }

    public Jugadores(String Nombre, int DineroDisponible, int Puntos, Guerreros Guerrero) {
        this.Nombre = Nombre;
        this.DineroDisponible = DineroDisponible;
        this.Puntos = Puntos;
        this.Guerrero = Guerrero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDineroDisponible() {
        return DineroDisponible;
    }

    public void setDineroDisponible(int DineroDisponible) {
        this.DineroDisponible = DineroDisponible;
    }

    public int getPuntos() {
        return Puntos;
    }

    public void setPuntos(int Puntos) {
        this.Puntos = Puntos;
    }

    public Guerreros getGuerrero() {
        return Guerrero;
    }

    public void setGuerrero(Guerreros Guerrero) {
        this.Guerrero = Guerrero;
    }

    @Override
    public String toString() {
        return "Jugadores: " + "Nombre=" + Nombre + ", DineroDisponible=" + DineroDisponible + ", Puntos=" + Puntos + ", Guerrero=" + Guerrero;
    }

    
}

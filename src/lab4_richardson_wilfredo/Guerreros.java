package lab4_richardson_wilfredo;

import java.util.ArrayList;

public abstract class Guerreros {
    private String Nombre;
    private int Edad;
    private String LugarNacimiento;
    private int PoderAtaque;//<=50
    private int Salud;//100>=x>=200
    private int Costo;//<=300

    public Guerreros() {
        //Arlem
    }

    public Guerreros(String Nombre, int Edad, String LugarNacimiento, int PoderAtaque, int Salud, int Costo) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.LugarNacimiento = LugarNacimiento;
        this.PoderAtaque = PoderAtaque;
        //try{
           // this.setPoderAtaque(PoderAtaque);
        //}catch(Errores e){
           // this.setPoderAtaque(50);
       // }
        this.Salud = Salud;
        this.Costo = Costo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getLugarNacimiento() {
        return LugarNacimiento;
    }

    public void setLugarNacimiento(String LugarNacimiento) {
        this.LugarNacimiento = LugarNacimiento;
    }

    public int getPoderAtaque() {
        return PoderAtaque;
    }

    public void setPoderAtaque(int PoderAtaque)throws Errores {
        //if (PoderAtaque < 50) {
          //  throw new  Errores("No debe ser menor a 50");
        //}
        this.PoderAtaque = PoderAtaque;
    }

    public int getSalud() {
        return Salud;
    }

    public void setSalud(int Salud) throws Errores{
       // if (Salud < 100 || Salud > 200) {
          //  throw new  Errores("No debe ser menor a 100 ni mayor a 200");
       // }
        this.Salud = Salud;
    }

    public int getCosto() {
        return Costo;
    }

    public void setCosto(int Costo) throws Errores{
      //  if ( Salud > 300) {
        //    throw new  Errores("No debe ser mayor a 300");
        //}
        this.Costo = Costo;
    }

    @Override
    public String toString() {
        return "Nombre: " + Nombre +"\nPoder de Ataque: " + PoderAtaque
                +"\nSalud: " + Salud;
    }
    public abstract void Atacar(int jud, ArrayList<Jugadores> Jugadores);
    
    
    
    
    
}

package lab4_richardson_wilfredo;
public class Guerreros {
    private String Nombre;
    private int Edad;
    private String LugarNacimiento;
    private int PoderAtaque;
    private int Salud;
    private int Costo;//arioas

    public Guerreros() {
    }

    public Guerreros(String Nombre, int Edad, String LugarNacimiento, int PoderAtaque, int Salud, int Costo) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.LugarNacimiento = LugarNacimiento;
        this.PoderAtaque = PoderAtaque;
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

    public void setPoderAtaque(int PoderAtaque) {
        this.PoderAtaque = PoderAtaque;
    }

    public int getSalud() {
        return Salud;
    }

    public void setSalud(int Salud) {
        this.Salud = Salud;
    }

    public int getCosto() {
        return Costo;
    }

    public void setCosto(int Costo) {
        this.Costo = Costo;
    }

    @Override
    public String toString() {
        return "Guerreros{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", LugarNacimiento=" + LugarNacimiento + ", PoderAtaque=" + PoderAtaque + ", Salud=" + Salud + ", Costo=" + Costo + '}';
    }
    
    
    
    
}

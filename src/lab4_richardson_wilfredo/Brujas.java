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
    
    
    
    
}

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
public class Arqueros extends Guerreros{
    private String MaterialArco;
    private String MaterialArmadura;

    public Arqueros() {
        super();
    }

    public Arqueros(String MaterialArco, String MaterialArmadura) {
        super();
        this.MaterialArco = MaterialArco;
        this.MaterialArmadura = MaterialArmadura;
    }

    public Arqueros(String MaterialArco, String MaterialArmadura, String Nombre, int Edad, String LugarNacimiento, int PoderAtaque, int Salud, int Costo) {
        super(Nombre, Edad, LugarNacimiento, PoderAtaque, Salud, Costo);
        this.MaterialArco = MaterialArco;
        this.MaterialArmadura = MaterialArmadura;
    }

    public String getMaterialArco() {
        return MaterialArco;
    }

    public void setMaterialArco(String MaterialArco) {
        this.MaterialArco = MaterialArco;
    }

    public String getMaterialArmadura() {
        return MaterialArmadura;
    }

    public void setMaterialArmadura(String MaterialArmadura) {
        this.MaterialArmadura = MaterialArmadura;
    }

    @Override
    public String toString() {
        return "Arqueros{" + "MaterialArco=" + MaterialArco + ", MaterialArmadura=" + MaterialArmadura + '}';
    }

    
    
    
}

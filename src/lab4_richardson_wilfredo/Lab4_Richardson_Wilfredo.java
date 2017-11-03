package lab4_richardson_wilfredo;

import javax.swing.JOptionPane;

public class Lab4_Richardson_Wilfredo {
    public static void main(String[] args) {
        System.out.println("Hola");
    }
    public int menu(){
        String [] opciones = {
            "1.-",
            "2.-",
            "3.-",
            "Salir"
        };
        String resp = (String) JOptionPane.showInputDialog(null, 
                            "Seleccione el producto", "PRODUCTOS", 
                            JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
        int op = Integer.parseInt(resp.charAt(0)+"");
        return op;
        
    }
    
}

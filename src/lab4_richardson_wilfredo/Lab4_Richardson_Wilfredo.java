package lab4_richardson_wilfredo;

import javax.swing.JOptionPane;

public class Lab4_Richardson_Wilfredo {
    public static void main(String[] args) {
        menu();
    }
    public static int menu(){
        String [] opciones = {
            "1.- Creacion de Guerreros",
            "2.- Eliminación de Guerreros",
            "3.- Registro Jugadores",
            "4.- Iniciar Partida",
            "5.- Listar Jugadores",
            "6.- Cargar Partidas",
            "Salir"
        };
        String resp = (String) JOptionPane.showInputDialog(null, 
                            "Seleccione el producto", "PRODUCTOS", 
                            JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
        int op = Integer.parseInt(resp.charAt(0)+"");
        return op;
        
    }
    
}

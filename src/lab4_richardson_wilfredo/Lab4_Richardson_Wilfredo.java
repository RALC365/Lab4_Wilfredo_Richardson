package lab4_richardson_wilfredo;

import javax.swing.JOptionPane;

public class Lab4_Richardson_Wilfredo {
    public static void main(String[] args) {
        
        switch (menu()){
            case 1:
                break;
            case 2:
                break;
            case 3:
                RegistroJugadores();
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                break;
        }
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
                            "Seleccione una opción", "MENÚ PRINCIPAL", 
                            JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
        int op = Integer.parseInt(resp.charAt(0)+"");
        return op;
    }
    
    public static void RegistroJugadores(){
        String Nombre=JOptionPane.showInputDialog("Ingrese el Nombre del Jugador:"); 
        int DineroDisponible=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Dinero Disponible:")); 
        int Puntos=0;
        int PosicionGuerrero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición a eliminar:"));
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //comentario
}

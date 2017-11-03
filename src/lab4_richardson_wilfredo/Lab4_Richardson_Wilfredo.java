package lab4_richardson_wilfredo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Lab4_Richardson_Wilfredo {
    static ArrayList<Jugadores> jugadores=new ArrayList();
    static ArrayList<Guerreros> guerreros=new ArrayList();
    
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        String resp="";
        while(!resp.equals("Salir")){
            String [] opciones = {
            "1.- Creacion de Guerreros",
            "2.- Eliminación de Guerreros",
            "3.- Registro Jugadores",
            "4.- Iniciar Partida",
            "5.- Listar Jugadores",
            "6.- Cargar Partidas",
            "Salir"
        };
        resp = (String) JOptionPane.showInputDialog(null, 
                            "Seleccione una opción", "MENÚ PRINCIPAL", 
                            JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
        if (resp.equals("1.- Creacion de Guerreros")) {
            
        }
        if (resp.equals("2.- Eliminación de Guerreros")) {
            
        }
        if (resp.equals("3.- Registro Jugadores")) {
            RegistroJugadores();
        }
        if (resp.equals("4.- Iniciar Partida")) {
            
        }
        if (resp.equals("5.- Listar Jugadores")) {
            ListarJugadores();
        }
        if (resp.equals("6.- Cargar Partidas")) {
            
        }
        }
    }
    
    public static void RegistroJugadores(){
        jugadores.add(new Jugadores());
        String Nombre=JOptionPane.showInputDialog("Ingrese el Nombre del Jugador:"); 
        jugadores.get(jugadores.size()-1).setNombre(Nombre);
        int DineroDisponible=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Dinero Disponible:"));
        jugadores.get(jugadores.size()-1).setDineroDisponible(DineroDisponible);
        int Puntos=0;
        jugadores.get(jugadores.size()-1).setPuntos(Puntos);
        int PosicionGuerrero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Poscion de Guerrero:"));
        Guerreros Guerrero=guerreros.get(PosicionGuerrero);
        jugadores.get(jugadores.size()-1).setGuerrero(Guerrero);
    }
    
    public static void ListarJugadores(){
        String s="________________________________________Personas________________________________________\n";
        for (Object t : jugadores) {
        s+=""+jugadores.indexOf(t)+""+") \n"+t+"\n\n";    
        }
        JOptionPane.showMessageDialog(null, s);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}

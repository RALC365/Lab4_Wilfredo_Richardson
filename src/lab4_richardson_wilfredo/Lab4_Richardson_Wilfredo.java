package lab4_richardson_wilfredo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Lab4_Richardson_Wilfredo {
    static ArrayList Partidas =new ArrayList(); 
    static ArrayList PartidasG =new ArrayList();
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
            CreacionGuerreros();
        }
        if (resp.equals("2.- Eliminación de Guerreros")) {
            if(guerreros.size()==0){
                    JOptionPane.showMessageDialog(null, "Debe Agregar Guerrero Primero!");
                }else{
                    int Pos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición a eliminar:"));
                    while (Pos>=guerreros.size()) {
                        JOptionPane.showMessageDialog(null, "Esa Posición no existe!");
                        Pos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición a eliminar:"));
                    }
                    guerreros.remove(Pos);
                }
        }
        if (resp.equals("3.- Registro Jugadores")) {
            if(guerreros.size()==0){
                    JOptionPane.showMessageDialog(null, "Debe Agregar Guerrero Primero!");
                }else{
                
            if(jugadores.size()>1){
                JOptionPane.showMessageDialog(null, "Ya están los dos jugadores!");
                break;
            }else{
                RegistroJugadores();
            }
            }
        }
        if (resp.equals("4.- Iniciar Partida")) {
            if(jugadores.size()==0){
                    JOptionPane.showMessageDialog(null, "Debe Agregar Jugadores Primero!");
            }else
            Partidas();
        }
        if (resp.equals("5.- Listar Jugadores")) {
            if(guerreros.size()==0){
                    JOptionPane.showMessageDialog(null, "Debe Agre0gar Jugadores Primero!");
            }else
            ListarJugadores();
        }
        if (resp.equals("6.- Cargar Partidas")) {
            if(guerreros.size()==0 || Partidas.size()==0){
                    JOptionPane.showMessageDialog(null, "Debe Agregar Jugadores y jugar una Partida Primero!");
            }else
            Continuar();    
        }
        }
    }
    
    public static void RegistroJugadores(){
        jugadores.add(new Jugadores());
        String Nombre=JOptionPane.showInputDialog("Ingrese el Nombre del Jugador:"); 
        jugadores.get(jugadores.size()-1).setNombre(Nombre);
        try{
        int DineroDisponible=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Dinero Disponible:"));
        jugadores.get(jugadores.size()-1).setDineroDisponible(DineroDisponible);
        }catch(NumberFormatException e1){
            JOptionPane.showMessageDialog(null, "Dato Incorrecto! Se pondrá 300 por defecto");
            int DineroDisponible=300;
            jugadores.get(jugadores.size()-1).setDineroDisponible(DineroDisponible);
        }
        int Puntos=0;
        jugadores.get(jugadores.size()-1).setPuntos(Puntos);
        String s="________________________________________Guerreros________________________________________\n";
                for (Object t : guerreros) {
                    s+=""+guerreros.indexOf(t)+""+") \n"+t+"\n\n";    
                }
                System.out.println(s);
        try{
        int PosicionGuerrero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Posicion de Guerrero:"));
        while(guerreros.get(guerreros.size()-1).getCosto() > jugadores.get(jugadores.size()-1).getDineroDisponible()){
            PosicionGuerrero=Integer.parseInt(JOptionPane.showInputDialog("No tiene sufuciente dinerio para ese!\nIngrese la Posicion de Guerrero:"));
        }
        Guerreros Guerrero=guerreros.get(PosicionGuerrero);
        jugadores.get(jugadores.size()-1).setGuerrero(Guerrero);
        }catch(IndexOutOfBoundsException e2){
            JOptionPane.showMessageDialog(null, "Dato Incorrecto! La posición será 0 por defecto");
            int PosicionGuerrero=0;
            Guerreros Guerrero=guerreros.get(PosicionGuerrero);
            jugadores.get(jugadores.size()-1).setGuerrero(Guerrero);
        }
    }
    
    public static void CreacionGuerreros(){
        String tipo="";
        String[] t={"Magos","Elfos","Dragones","Arqueros","Brujas"};
        tipo=(String) JOptionPane.showInputDialog(null, "Seleccion un tipo de persona:","Agregar", JOptionPane.DEFAULT_OPTION, null, t, t[0]);
        if(tipo.equals(t[0])){
            Magos();
        }
        if(tipo.equals(t[1])){
            Elfos();
        }
        if(tipo.equals(t[2])){
            Dragones();
        }
        if(tipo.equals(t[3])){
            Arqueros();
        }
        if(tipo.equals(t[4])){
            Brujas();
        }
    }
    
    public static void Magos(){
        guerreros.add(new Magos());
        String Nombre=JOptionPane.showInputDialog("Ingrese el Nombre:");
        ((Magos) guerreros.get(guerreros.size()-1)).setNombre(Nombre);
        try{
        int Edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad:"));
        ((Magos) guerreros.get(guerreros.size()-1)).setEdad(Edad);
        }catch(NumberFormatException e1){
            JOptionPane.showMessageDialog(null, "Dato Incorrecto! Se pondrá 30 por defecto");
            int Edad=30;
            ((Magos) guerreros.get(guerreros.size()-1)).setEdad(Edad);
        }
        String LugarNacimiento=JOptionPane.showInputDialog("Ingrese el Lugar de Nacimiento:");
        ((Magos) guerreros.get(guerreros.size()-1)).setLugarNacimiento(LugarNacimiento);
        try{
        int PoderAtaque=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Poder de Ataque:"));
        while(PoderAtaque>50 || PoderAtaque<0){
            PoderAtaque=Integer.parseInt(JOptionPane.showInputDialog("Dato Incorrecto!\nIngrese el Poder de Ataque:"));
        }
        ((Magos) guerreros.get(guerreros.size()-1)).setPoderAtaque(PoderAtaque);
        }catch(NumberFormatException e2){
            JOptionPane.showMessageDialog(null, "Dato Incorrecto! Se pondrá 30 por defecto");
            int PoderAtaque=30;
            ((Magos) guerreros.get(guerreros.size()-1)).setPoderAtaque(PoderAtaque);
        }
        try{
        int Salud=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Salud:"));
        while(Salud>200 || Salud<100){
            Salud=Integer.parseInt(JOptionPane.showInputDialog("Dato Incorrecto!\nIngrese la Salud:"));
        }((Magos) guerreros.get(guerreros.size()-1)).setSalud(Salud);
        }catch(NumberFormatException e2){
            JOptionPane.showMessageDialog(null, "Dato Incorrecto! Se pondrá 100 por defecto");
            int Salud=100;
            ((Magos) guerreros.get(guerreros.size()-1)).setSalud(Salud);
        }
        try{
        int Costo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Costo:"));
        while(Costo>300){
            Costo=Integer.parseInt(JOptionPane.showInputDialog("Dato Incorrecto!\nIngrese el Costo:"));
        }
        ((Magos) guerreros.get(guerreros.size()-1)).setCosto(Costo);
        }catch(NumberFormatException e2){
            JOptionPane.showMessageDialog(null, "Dato Incorrecto! Se pondrá 100 por defecto");
            int Costo=100;
            ((Magos) guerreros.get(guerreros.size()-1)).setCosto(Costo);
        }
        String TipoMagia=JOptionPane.showInputDialog("Ingrese el Tipo de Magia:"); 
        ((Magos) guerreros.get(guerreros.size()-1)).setTipoMagia(TipoMagia);
        String ElementoFavorito=JOptionPane.showInputDialog("Ingrese el Elemento Favorito:");
        ((Magos) guerreros.get(guerreros.size()-1)).setElementoFavorito(ElementoFavorito);
    }
    
    public static void Elfos(){
        guerreros.add(new Elfos());
        String Nombre=JOptionPane.showInputDialog("Ingrese el Nombre:");
        ((Elfos) guerreros.get(guerreros.size()-1)).setNombre(Nombre);
        try{
        int Edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad:"));
        ((Elfos) guerreros.get(guerreros.size()-1)).setEdad(Edad);
        }catch(NumberFormatException e1){
            JOptionPane.showMessageDialog(null, "Dato Incorrecto! Se pondrá 30 por defecto");
            int Edad=30;
            ((Elfos) guerreros.get(guerreros.size()-1)).setEdad(Edad);
        }
        String LugarNacimiento=JOptionPane.showInputDialog("Ingrese el Lugar de Nacimiento:");
        ((Elfos) guerreros.get(guerreros.size()-1)).setLugarNacimiento(LugarNacimiento);
        try{
        int PoderAtaque=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Poder de Ataque:"));
        while(PoderAtaque>50 || PoderAtaque<0){
            PoderAtaque=Integer.parseInt(JOptionPane.showInputDialog("Dato Incorrecto!\nIngrese el Poder de Ataque:"));
        }
        ((Elfos) guerreros.get(guerreros.size()-1)).setPoderAtaque(PoderAtaque);
        }catch(NumberFormatException e2){
            JOptionPane.showMessageDialog(null, "Dato Incorrecto! Se pondrá 30 por defecto");
            int PoderAtaque=30;
            ((Elfos) guerreros.get(guerreros.size()-1)).setPoderAtaque(PoderAtaque);
        }
        try{
        int Salud=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Salud:"));
        while(Salud>200 || Salud<100){
            Salud=Integer.parseInt(JOptionPane.showInputDialog("Dato Incorrecto!\nIngrese la Salud:"));
        }((Elfos) guerreros.get(guerreros.size()-1)).setSalud(Salud);
        }catch(NumberFormatException e2){
            JOptionPane.showMessageDialog(null, "Dato Incorrecto! Se pondrá 100 por defecto");
            int Salud=100;
            ((Elfos) guerreros.get(guerreros.size()-1)).setSalud(Salud);
        }
        try{
        int Costo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Costo:"));
        while(Costo>300){
            Costo=Integer.parseInt(JOptionPane.showInputDialog("Dato Incorrecto!\nIngrese el Costo:"));
        }
        ((Elfos) guerreros.get(guerreros.size()-1)).setCosto(Costo);
        }catch(NumberFormatException e2){
            JOptionPane.showMessageDialog(null, "Dato Incorrecto! Se pondrá 100 por defecto");
            int Costo=100;
            ((Elfos) guerreros.get(guerreros.size()-1)).setCosto(Costo);
        }
        String TipoArma=JOptionPane.showInputDialog("Ingrese el Tipo de Arma:"); 
        ((Elfos) guerreros.get(guerreros.size()-1)).setTipoArma(TipoArma);
        String RangoMilitar=JOptionPane.showInputDialog("Ingrese el Rango Militar:");
        ((Elfos) guerreros.get(guerreros.size()-1)).setRangoMilitar(RangoMilitar);
    }
    
    public static void Dragones(){
        guerreros.add(new Dragones());
        String Nombre=JOptionPane.showInputDialog("Ingrese el Nombre:");
        ((Dragones) guerreros.get(guerreros.size()-1)).setNombre(Nombre);
        try{
        int Edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad:"));
        ((Dragones) guerreros.get(guerreros.size()-1)).setEdad(Edad);
        }catch(NumberFormatException e1){
            JOptionPane.showMessageDialog(null, "Dato Incorrecto! Se pondrá 30 por defecto");
            int Edad=30;
            ((Dragones) guerreros.get(guerreros.size()-1)).setEdad(Edad);
        }
        String LugarNacimiento=JOptionPane.showInputDialog("Ingrese el Lugar de Nacimiento:");
        ((Dragones) guerreros.get(guerreros.size()-1)).setLugarNacimiento(LugarNacimiento);
        try{
        int PoderAtaque=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Poder de Ataque:"));
        while(PoderAtaque>50 || PoderAtaque<0){
            PoderAtaque=Integer.parseInt(JOptionPane.showInputDialog("Dato Incorrecto!\nIngrese el Poder de Ataque:"));
        }
        ((Dragones) guerreros.get(guerreros.size()-1)).setPoderAtaque(PoderAtaque);
        }catch(NumberFormatException e2){
            JOptionPane.showMessageDialog(null, "Dato Incorrecto! Se pondrá 30 por defecto");
            int PoderAtaque=30;
            ((Dragones) guerreros.get(guerreros.size()-1)).setPoderAtaque(PoderAtaque);
        }
        try{
        int Salud=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Salud:"));
        while(Salud>200 || Salud<100){
            Salud=Integer.parseInt(JOptionPane.showInputDialog("Dato Incorrecto!\nIngrese la Salud:"));
        }((Dragones) guerreros.get(guerreros.size()-1)).setSalud(Salud);
        }catch(NumberFormatException e2){
            JOptionPane.showMessageDialog(null, "Dato Incorrecto! Se pondrá 100 por defecto");
            int Salud=100;
            ((Dragones) guerreros.get(guerreros.size()-1)).setSalud(Salud);
        }
        try{
        int Costo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Costo:"));
        while(Costo>300){
            Costo=Integer.parseInt(JOptionPane.showInputDialog("Dato Incorrecto!\nIngrese el Costo:"));
        }
        ((Dragones) guerreros.get(guerreros.size()-1)).setCosto(Costo);
        }catch(NumberFormatException e2){
            JOptionPane.showMessageDialog(null, "Dato Incorrecto! Se pondrá 100 por defecto");
            int Costo=100;
            ((Dragones) guerreros.get(guerreros.size()-1)).setCosto(Costo);
        }
        String Color=JOptionPane.showInputDialog("Ingrese el Color:");
        ((Dragones) guerreros.get(guerreros.size()-1)).setColor(Color);
        String Raza=JOptionPane.showInputDialog("Ingrese la Raza:");
        ((Dragones) guerreros.get(guerreros.size()-1)).setRaza(Raza);
    }
    
    public static void Arqueros(){
        guerreros.add(new Arqueros());
        String Nombre=JOptionPane.showInputDialog("Ingrese el Nombre:");
        ((Arqueros) guerreros.get(guerreros.size()-1)).setNombre(Nombre);
        try{
        int Edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad:"));
        ((Arqueros) guerreros.get(guerreros.size()-1)).setEdad(Edad);
        }catch(NumberFormatException e1){
            JOptionPane.showMessageDialog(null, "Dato Incorrecto! Se pondrá 30 por defecto");
            int Edad=30;
            ((Arqueros) guerreros.get(guerreros.size()-1)).setEdad(Edad);
        }
        String LugarNacimiento=JOptionPane.showInputDialog("Ingrese el Lugar de Nacimiento:");
        ((Arqueros) guerreros.get(guerreros.size()-1)).setLugarNacimiento(LugarNacimiento);
        try{
        int PoderAtaque=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Poder de Ataque:"));
        while(PoderAtaque>50 || PoderAtaque<0){
            PoderAtaque=Integer.parseInt(JOptionPane.showInputDialog("Dato Incorrecto!\nIngrese el Poder de Ataque:"));
        }
        ((Arqueros) guerreros.get(guerreros.size()-1)).setPoderAtaque(PoderAtaque);
        }catch(NumberFormatException e2){
            JOptionPane.showMessageDialog(null, "Dato Incorrecto! Se pondrá 30 por defecto");
            int PoderAtaque=30;
            ((Arqueros) guerreros.get(guerreros.size()-1)).setPoderAtaque(PoderAtaque);
        }
        try{
        int Salud=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Salud:"));
        while(Salud>200 || Salud<100){
            Salud=Integer.parseInt(JOptionPane.showInputDialog("Dato Incorrecto!\nIngrese la Salud:"));
        }((Arqueros) guerreros.get(guerreros.size()-1)).setSalud(Salud);
        }catch(NumberFormatException e2){
            JOptionPane.showMessageDialog(null, "Dato Incorrecto! Se pondrá 100 por defecto");
            int Salud=100;
            ((Arqueros) guerreros.get(guerreros.size()-1)).setSalud(Salud);
        }
        try{
        int Costo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Costo:"));
        while(Costo>300){
            Costo=Integer.parseInt(JOptionPane.showInputDialog("Dato Incorrecto!\nIngrese el Costo:"));
        }
        ((Arqueros) guerreros.get(guerreros.size()-1)).setCosto(Costo);
        }catch(NumberFormatException e2){
            JOptionPane.showMessageDialog(null, "Dato Incorrecto! Se pondrá 100 por defecto");
            int Costo=100;
            ((Arqueros) guerreros.get(guerreros.size()-1)).setCosto(Costo);
        }
        String MaterialArco=JOptionPane.showInputDialog("Ingrese el Material del Arco:"); 
        ((Arqueros) guerreros.get(guerreros.size()-1)).setMaterialArco(MaterialArco);
        String MaterialArmadura=JOptionPane.showInputDialog("Ingrese el Material de Armadura:"); 
        ((Arqueros) guerreros.get(guerreros.size()-1)).setMaterialArmadura(MaterialArmadura);
    }
    
    public static void Brujas(){
        guerreros.add(new Brujas());
        String Nombre=JOptionPane.showInputDialog("Ingrese el Nombre:");
        ((Brujas) guerreros.get(guerreros.size()-1)).setNombre(Nombre);
        try{
        int Edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad:"));
        ((Brujas) guerreros.get(guerreros.size()-1)).setEdad(Edad);
        }catch(NumberFormatException e1){
            JOptionPane.showMessageDialog(null, "Dato Incorrecto! Se pondrá 30 por defecto");
            int Edad=30;
            ((Brujas) guerreros.get(guerreros.size()-1)).setEdad(Edad);
        }
        String LugarNacimiento=JOptionPane.showInputDialog("Ingrese el Lugar de Nacimiento:");
        ((Brujas) guerreros.get(guerreros.size()-1)).setLugarNacimiento(LugarNacimiento);
        try{
        int PoderAtaque=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Poder de Ataque:"));
        while(PoderAtaque>50 || PoderAtaque<0){
            PoderAtaque=Integer.parseInt(JOptionPane.showInputDialog("Dato Incorrecto!\nIngrese el Poder de Ataque:"));
        }
        ((Brujas) guerreros.get(guerreros.size()-1)).setPoderAtaque(PoderAtaque);
        }catch(NumberFormatException e2){
            JOptionPane.showMessageDialog(null, "Dato Incorrecto! Se pondrá 30 por defecto");
            int PoderAtaque=30;
            ((Brujas) guerreros.get(guerreros.size()-1)).setPoderAtaque(PoderAtaque);
        }
        try{
        int Salud=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Salud:"));
        while(Salud>200 || Salud<100){
            Salud=Integer.parseInt(JOptionPane.showInputDialog("Dato Incorrecto!\nIngrese la Salud:"));
        }((Brujas) guerreros.get(guerreros.size()-1)).setSalud(Salud);
        }catch(NumberFormatException e2){
            JOptionPane.showMessageDialog(null, "Dato Incorrecto! Se pondrá 100 por defecto");
            int Salud=100;
            ((Brujas) guerreros.get(guerreros.size()-1)).setSalud(Salud);
        }
        try{
        int Costo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Costo:"));
        while(Costo>300){
            Costo=Integer.parseInt(JOptionPane.showInputDialog("Dato Incorrecto!\nIngrese el Costo:"));
        }
        ((Brujas) guerreros.get(guerreros.size()-1)).setCosto(Costo);
        }catch(NumberFormatException e2){
            JOptionPane.showMessageDialog(null, "Dato Incorrecto! Se pondrá 100 por defecto");
            int Costo=100;
            ((Brujas) guerreros.get(guerreros.size()-1)).setCosto(Costo);
        }
        try{
        int SigloNacimiento=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Siglo de Nacimiento:")); 
        ((Brujas) guerreros.get(guerreros.size()-1)).setSigloNacimiento(SigloNacimiento);
        }catch(NumberFormatException e2){
            JOptionPane.showMessageDialog(null, "Dato Incorrecto! Se pondrá 19 por defecto");
            int SigloNacimiento=19;
            ((Brujas) guerreros.get(guerreros.size()-1)).setSigloNacimiento(SigloNacimiento);
        }
        String LugarResidencia=JOptionPane.showInputDialog("Ingrese el Luagr de Residencia:");
        ((Brujas) guerreros.get(guerreros.size()-1)).setLugarResidencia(LugarResidencia);
    }
    
    public static void ListarJugadores(){
        String s="________________________________________Jugadores________________________________________\n";
        for (Object t : jugadores) {
        s+=""+jugadores.indexOf(t)+""+") \n"+t+"\n\n";    
        }
        JOptionPane.showMessageDialog(null, s);
    }
    
    public static void Partidas(){
        String s="________________________________________Jugadores________________________________________\n";
        for (Object t : jugadores) {
        s+=""+jugadores.indexOf(t)+""+") \n"+t+"\n\n";    
        }
        System.out.println(s);
        int Pos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el jugador a ser Jugador 1"));
        while (Pos>=jugadores.size()) {
        JOptionPane.showMessageDialog(null, "Esa Posición no existe!");
        Pos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el jugador a se Jugador1"));
        }
        while(jugadores.get(0).getGuerrero().getSalud() >0 || jugadores.get(1).getGuerrero().getSalud()>0){
            if (Pos==0) {
                System.out.println("\u001B[31mTurno Jugador 1 \u001B[0m ");
                System.out.print("");
                jugadores = guerreros.get(Pos).Atacar(1, jugadores);
                Partidas.add(jugadores);
                System.out.println("\u001B[32mTurno Jugador 2 \u001B[0m");
                jugadores = guerreros.get(Pos).Atacar(0, jugadores);
                Partidas.add(jugadores);
            }else{
                System.out.println("\u001B[31mTurno Jugador 1 \u001B[0m");
                jugadores = guerreros.get(Pos).Atacar(0, jugadores);
                Partidas.add(jugadores);
                System.out.println("\u001B[32mTurno Jugador 2 \u001B[0m");
                jugadores = guerreros.get(Pos).Atacar(1, jugadores);
                Partidas.add(jugadores);
            }
        }
        PartidasG.add(Partidas);
        if(guerreros.get(0).getSalud()<guerreros.get(1).getSalud()){
            JOptionPane.showMessageDialog(null, "Jugador:"+jugadores.get(1).getNombre()+"GANA!");
            int p=jugadores.get(1).getPuntos()+3;
            jugadores.get(1).setPuntos(p);
        }else{
            JOptionPane.showMessageDialog(null, "Jugador:"+jugadores.get(0).getNombre()+"GANA!");
            int p=jugadores.get(0).getPuntos()+3;
            jugadores.get(0).setPuntos(p);
        }
    }
    
    public static void Continuar(){
        String s="________________________________________Ataques Guardados________________________________________\n";
        for (Object t : PartidasG) {
        s+=""+PartidasG.indexOf(t)+""+") \n"+t+"\n\n";    
        System.out.println(s);
        }
        int pos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la partida guardada:"));
        String S="________________________________________Ataques Guardados________________________________________\n";
        for (Object t : Partidas) {
        S+=""+Partidas.indexOf(t)+""+") \n"+t+"\n\n";    
        System.out.println(S);
        }
        
        int x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ataque a retornar:"));
        Partidas.get(x);
        System.out.println("_____________________Ataques Retornado______________");
        for (int i = x; i < Partidas.size(); i++) {
            System.out.println(Partidas.get(i));
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}

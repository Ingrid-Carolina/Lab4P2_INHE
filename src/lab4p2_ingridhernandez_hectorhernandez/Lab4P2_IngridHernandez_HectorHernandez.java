/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p2_ingridhernandez_hectorhernandez;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ADMINISTRADOR1
 */
public class Lab4P2_IngridHernandez_HectorHernandez {

    /**
     * @param args the command line arguments
     */
    static Scanner lea = new Scanner(System.in);
    static Random r = new Random();
    static ArrayList<Jugadores> jug = new ArrayList();
    static ArrayList<Vehiculos> veh = new ArrayList();

    public static void main(String[] args) {

        boolean centinela = true;
        while (centinela == true) {
            System.out.println("=============== Menu ==============");
            System.out.println("1) Crear Jugadores y Vehiculos");
            System.out.println("2) Jugar");
            System.out.println("3) Salir");
            System.out.println("===================================");
            System.out.print("Ingrese la opcion que desea: ");
            int opcion = lea.nextInt();
            switch (opcion) {
                case 1: {
                    String jugadores[] = {"Hector", "Diviana", "Carlos", "Diego", "Jose", "Monolito", "Paulina", "Daniel", "James", "Andres", "Esther", "Rigoberto", "Luis", "Kratos", "Odin", "Zeus", "Thor", "Loki", "Freya"};
                    String vehiculos[] = {"Ferrari", "Lamborgini", "Maclaren", "Formula 1", "Chevrolet", "Nissan", "Hyundai", "Toyota", "Triton", "Hilux", "Eon", "Santa Fe", "Mustang", "Jeep", "Sancho Panza", "Demogorgon", "Mark Anthony"};

                    boolean bandera = true;
                    while (bandera == true) {
                        System.out.println();
                        System.out.println("=========== Submenu ==============");
                        System.out.println("1) Crear Jugador ");
                        System.out.println("2) Crear Vehiculos ");
                        System.out.println("3) Salir");
                        System.out.println("===================================");
                        System.out.print("Ingrese la opcion que desea: ");
                        int op = lea.nextInt();
                        switch (op) {
                            case 1: {
                                System.out.print("Cuantos jugadores desea crear? ");
                                int cantidad = lea.nextInt();
                                for (int i = 0; i <= cantidad; i++) {
                                    int victorias = 0;
                                    int pos;
                                    pos = r.nextInt(jugadores.length - 1);
                                    String nombre = jugadores[pos];
                                    jug.add(new Jugadores(nombre, victorias));
                                }

                                System.out.println("Jugadores: ");
                                String salida = "";
                                for (Object t : jug) {
                                    if (t instanceof Jugadores) {
                                        String mensaje = String.format("%d %s%n", jug.indexOf(t), t);
                                        salida += mensaje;
                                    }
                                }
                                System.out.println(salida);
                            }//fin del case 1
                            break;
                            case 2: {
                                boolean centinela3 = true;
                                while (centinela3 == true) {
                                    System.out.println("============Tipo de Vehiculos ===========");
                                    System.out.println("1)Aviones ");
                                    System.out.println("2)Barcos ");
                                    System.out.println("3)Submarinos");
                                    System.out.println("4)Salir");
                                    System.out.println("=========================================");
                                    System.out.print("Cuantos Vehiculos desea crear? ");
                                    int cantidad = lea.nextInt();
                                    for (int i = 0; i <= cantidad; i++) {
                                    int o = 1+r.nextInt(3);
                                    switch (o) {
                                        case 1: {
                                            try {
                                                int pos2;
                                                pos2 = r.nextInt(vehiculos.length - 1);
                                                String nombre = vehiculos[pos2];
                                                int da = 100 + r.nextInt(150);
                                                int vida = 500 + r.nextInt(500);
                                                int pos;
                                                pos = r.nextInt(jug.size() - 1);

                                                veh.add(new Aviones( nombre, da, vida, jug.get(pos)));

                                                System.out.println("Aviones: ");
                                                String salida = "";
                                                for (Vehiculos e : veh) {
                                                    if (e instanceof Aviones) {
                                                        String mensaje = String.format("%d %s%n", veh.indexOf(e), e);
                                                        salida += mensaje;
                                                    }
                                                }
                                                System.out.println(salida);

                                            } catch (Exception e) {
                                                System.out.println("Tiene que crear jugadores primero!");
                                            }

                                        }//fin del case 1
                                        break;
                                        case 2: {
                                            try {
                                                int pos2;
                                                pos2 = r.nextInt(vehiculos.length - 1);
                                                String nombre = vehiculos[pos2];
                                                int da = 100 + r.nextInt(150);
                                                int vida = 500 + r.nextInt(500);
                                                int pos;
                                                pos = r.nextInt(jug.size() - 1);
                                                veh.add(new Barcos( nombre, da, vida, jug.get(pos)));
                                                System.out.println("Barcos: ");
                                                String salida = "";
                                                for (Object e : veh) {
                                                    if (e instanceof Barcos) {
                                                        String mensaje = String.format("%d %s%n", veh.indexOf(e), e);
                                                        salida += mensaje;
                                                    }
                                                }
                                                System.out.println(salida);

                                            } catch (Exception e) {
                                                System.out.println("Tiene que crear jugadores primero!");
                                            }
                                        }//fin del case 2
                                        break;
                                        case 3: {
                                            try {
                                                int pos2;
                                                pos2 = r.nextInt(vehiculos.length - 1);
                                                String nombre = vehiculos[pos2];
                                                int da = 100 + r.nextInt(150);
                                                int vida = 500 + r.nextInt(500);
                                                int pos;
                                                pos = r.nextInt(jug.size() - 1);

                                                veh.add(new Submarinos(nombre, da, vida, jug.get(pos)));
                                                System.out.println("Submarinos: ");
                                                String salida = "";
                                                for (Object e : veh) {
                                                    if (e instanceof Submarinos) {
                                                        String mensaje = String.format("%d %s%n", veh.indexOf(e), e);
                                                        salida += mensaje;
                                                    }
                                                }
                                                System.out.println(salida);
                                            } catch (Exception e) {
                                                System.out.println("Tiene que crear jugadores primero!");
                                            }
                                        }//fin del case 3
                                        break;
                                        case 4:
                                            centinela3 = false;
                                            break;
                                        default:
                                            System.out.println("Opcion Incorrecta");
                                    }//fin del switch
                                    centinela3 = false;
                                   }
                                    
                                }//fin while
                            }//fin del case 2
                            break;
                            case 3:
                                bandera = false;
                                break;
                            default:
                                System.out.println("Opcion Incorrecta");
                        }//fin del switch
                    }//fin while
                }//fin del case 1
                break;
                case 2: {
                    Object[][] matriz = new Object[10][10];
                    System.out.println("MAPA");
                    matriz = Lectura();
                    Imprimir(matriz);
                    
                }//fin del case 2
                break;
                case 3:
                    centinela = false;
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }//fin del switch
        }//fin while
    }// Fin del main

    public static Object[][] Lectura() {
        Object[][] llena = new Object[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                llena[i][j] = "  ";
            }
        }
        System.out.println(veh.size());

        int pos = 1 + r.nextInt(veh.size()-1);
        
        for (int k = 0; k < 2; k++){
            String color = k == 0 ? "Rojo" : "Azul";
            for (int i = 0; i < pos; i++) {
                int x = r.nextInt(9);
                int y = r.nextInt(9);
                int eleccion = r.nextInt(veh.size());
                ((Vehiculos) veh.get(eleccion)).setTColor(color);
                if (veh.get(eleccion) instanceof Aviones) {
                        do{
                            x = r.nextInt(9);
                            y = r.nextInt(9);
                         }while(!llena[x][y].equals("  "));
                        System.out.println(x+","+y);
                        if (color.equals("Rojo")) {
                            String a = "AR";
                            llena[x][y] = a;
                           
                        } else if (color.equals("Azul")) {
                            String a = "AA";
                            llena[x][y] = a;
                            
                        }
                    }
                    if (veh.get(eleccion) instanceof Barcos) {
                        
                        if (color.equals("Rojo")) {
                            do{                           
                            y = r.nextInt(9);
                         }while(!llena[0][y].equals("  "));
                            System.out.println(x+"/RB"+y);
                            String a = "BR";
                            llena[0][y] = a;
                            
                        } else if (color.equals("Azul")) {
                            do{                           
                            y = r.nextInt(9);
                         }while(!llena[9][y].equals("  "));
                            System.out.println(x+"//AB"+y);
                            String a = "BA";
                            llena[9][y] = a;
                           
                        }
                    }
                    if (veh.get(eleccion) instanceof Submarinos) {
                        
                        if (color.equals("Rojo")) {
                            do{
                                y = r.nextInt(9);
                            }while(!llena[1][y].equals("  "));
                            System.out.println(x+"=RS "+y);
                            String a = "SR";
                            llena[1][y] = a;
                            
                            
                        } else if (color.equals("Azul")) {
                            do{
                                y = r.nextInt(9);
                            }while(!llena[8][y].equals("  "));
                            System.out.println(x+"==AS "+y);
                            String a = "SA";
                            llena[8][y] = a;
                            
                        }
                    }
                
            }//Fin for
        }
        return llena;
    }

    public static void Imprimir(Object[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]" + " ");
            }
            System.out.println();
        }
    }
}

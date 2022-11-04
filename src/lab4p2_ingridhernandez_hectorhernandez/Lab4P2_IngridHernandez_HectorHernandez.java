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
                                    System.out.print("Ingrese la opcion que desea: ");
                                    int o = lea.nextInt();
                                    switch (o) {
                                        case 1: {
                                            try {
                                                int pos2;
                                                pos2 = r.nextInt(vehiculos.length - 1);
                                                String nombre = vehiculos[pos2];
                                                int da = 100 + r.nextInt(150);
                                                int cordX = 0;
                                                int coordY = 0;
                                                int vida = 500 + r.nextInt(500);
                                                int pos;
                                                pos = r.nextInt(jug.size() - 1);

                                                System.out.println("============ Tipo de Equipo ============ ");
                                                System.out.println("1)Equipo Azul");
                                                System.out.println("2)Equipo Rojo");
                                                System.out.println("======================================");
                                                System.out.println("Ingrese el Tipo de Equipo que Desea: ");
                                                int p = lea.nextInt();
                                                String t = "";
                                                if (p == 1) {
                                                    t = "Azul ";
                                                } else if (p == 2) {
                                                    t = "Rojo";
                                                } else {
                                                    System.out.println("El numero que Ingrese no Esta:");
                                                }
                                                System.out.println("Ingrese la Coordenada X:");
                                                int corx = lea.nextInt();
                                                System.out.println("Ingrese la Coordenada Y:");
                                                int corY = lea.nextInt();
                                                veh.add(new Aviones(corx, corY, nombre, da, cordX, coordY, vida, jug.get(pos), t));

                                                System.out.println("Aviones: ");
                                                String salida = "";
                                                for (Object e : veh) {
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
                                                int cordX = 0;
                                                int coordY = 0;
                                                int vida = 500 + r.nextInt(500);
                                                int pos;
                                                pos = r.nextInt(jug.size() - 1);

                                                System.out.println("============ Tipo de Equipo ============ ");
                                                System.out.println("1)Equipo Azul");
                                                System.out.println("2)Equipo Rojo");
                                                System.out.println("======================================");
                                                System.out.println("Ingrese el Tipo de Equipo que Desea: ");
                                                int p = lea.nextInt();
                                                String t = "";
                                                if (p == 1) {
                                                    t = "Azul ";
                                                } else if (p == 2) {
                                                    t = "Rojo";
                                                } else {
                                                    System.out.println("El numero que Ingrese no Esta:");
                                                }
                                                System.out.println("Ingrese la Coordenada X:");
                                                int corx = lea.nextInt();
                                                System.out.println("Ingrese la Coordenada Y:");
                                                int corY = lea.nextInt();
                                                veh.add(new Barcos(corx, corY, nombre, da, cordX, coordY, vida, jug.get(pos), t));
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
                                                int cordX = 0;
                                                int coordY = 0;
                                                int vida = 500 + r.nextInt(500);
                                                int pos;
                                                pos = r.nextInt(jug.size() - 1);

                                                System.out.println("============ Tipo de Equipo ============ ");
                                                System.out.println("1)Equipo Azul");
                                                System.out.println("2)Equipo Rojo");
                                                System.out.println("======================================");
                                                System.out.println("Ingrese el Tipo de Equipo que Desea: ");
                                                int p = lea.nextInt();
                                                String t = "";
                                                if (p == 1) {
                                                    t = "Azul ";
                                                } else if (p == 2) {
                                                    t = "Rojo";
                                                } else {
                                                    System.out.println("El numero que Ingrese no Esta:");
                                                }
                                                System.out.println("Ingrese la Coordenada X:");
                                                int corx = lea.nextInt();
                                                System.out.println("Ingrese la Coordenada Y:");
                                                int corY = lea.nextInt();
                                                veh.add(new Submarinos(corx, corY, nombre, da, cordX, coordY, vida, jug.get(pos), t));
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

        int pos =r.nextInt(veh.size());
        int contador = 0;
        for (int i = 0; i < pos; i++) {
            int x = r.nextInt(9);
            int y = r.nextInt(9);
            if (contador < veh.size()) {
                if (veh.get(contador) instanceof Aviones) {
                    System.out.println("es avion");
                    if (((Vehiculos) veh.get(contador)).getTColor().equals("Rojo")) {
                        String a = "AR";
                        llena[x][y] = a;
                        System.out.println(a);
                        contador++;
                    } else if (((Vehiculos) veh.get(contador)).getTColor().equals("Azul")) {
                        String a = "AA";
                        llena[x][y] = a;
                        contador++;
                    }
                }
                if (veh.get(contador) instanceof Barcos) {
                    if (((Vehiculos) veh.get(contador)).getTColor().equals("Rojo")) {
                        String a = "BR";
                        llena[x][y] = a;
                        contador++;
                    } else if (((Vehiculos) veh.get(contador)).getTColor().equals("Azul")) {
                        String a = "BA";
                        llena[x][y] = a;
                        contador++;
                    }
                }
                if (veh.get(contador) instanceof Submarinos) {
                    if (((Vehiculos) veh.get(contador)).getTColor().equals("Rojo")) {
                        String a = "SR";
                        llena[x][y] = a;
                        contador++;
                    } else if (((Vehiculos) veh.get(contador)).getTColor().equals("Azul")) {
                        String a = "SA";
                        llena[x][y] = a;
                        contador++;
                    }
                }
            }
        }//Fin for
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

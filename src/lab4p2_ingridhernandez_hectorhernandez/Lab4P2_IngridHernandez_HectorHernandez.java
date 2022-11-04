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
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        Random r = new Random();

        ArrayList<Jugadores> jug = new ArrayList();
        ArrayList<Vehiculos> veh = new ArrayList();
        
        boolean centinela = true;
        while (centinela == true) {
            System.out.println("=====Menu=====");
            System.out.println("1) Crear Jugadores y Vehiculos");
            System.out.println("2) Jugar");
            System.out.println("3) Salir");
            System.out.print("Ingrese la opcion que desea: ");
            int opcion = lea.nextInt();
            switch (opcion) {
                case 1: {
                    String jugadores[] = {"Hector", "Diviana", "Carlos", "Diego", "Jose", "Monolito", "Paulina", "Daniel", "James", "Andres", "Esther", "Rigoberto", "Luis", "Kratos", "Odin", "Zeus", "Thor", "Loki", "Freya"};
                    String vehiculos[] = {"Ferrari", "Lamborgini", "Maclaren", "Formula 1", "Chevrolet", "Nissan", "Hyundai", "Toyota", "Triton", "Hilux", "Eon", "Santa Fe", "Mustang", "Jeep", "Sancho Panza", "Demogorgon", "Mark Anthony"};
                    
                    boolean bandera = true;
                    while (bandera == true) {
                        System.out.println("1) Crear Jugador ");
                        System.out.println("2) Crear Vehiculos ");
                        System.out.println("3) Salir");
                        System.out.print("Ingrese la opcion que desea: ");
                        int op = lea.nextInt();
                        switch (op) {
                            case 1: {
                                int victorias = 0;
                                
                                int pos;
                                pos = r.nextInt(jugadores.length-1);
                                String nombre = jugadores[pos];
                                
                                jug.add(new Jugadores(nombre, victorias));
                                
                                System.out.println("Jugadores: ");
                                System.out.println(jug);
                            }//fin del case 1
                            break;
                            case 2: {

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

                }//fin del case 2
                break;
                case 3: 
                    centinela = false;
                    break;
               
                default:
                    System.out.println("Opcion Incorrecta");
            }//fin del switch
        }//fin while
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p2_ingridhernandez_hectorhernandez;

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

        boolean centinela = true;

        while (centinela == true) {
            System.out.println("1) Crear Jugadores y Vehiculos");
            System.out.println("2) Jugar");
            System.out.println("3) Salir");
            System.out.print("Ingrese la opcion que desea: ");
            int opcion = lea.nextInt();
            switch (opcion) {
                case 1: {
                    String jugadores [] = {"Hector", "Diviana", "Carlos", "Diego", "Jose", "Monolito", "Paulina", "Daniel", "James", "Andres", "Esther", "Rigoberto", "Luis", "Kratos", "Odin", "Zeus", "Thor", "Loki", "Freya"};
                    String vehiculos [] = {"Ferrari", "Lamborgini", "Maclaren", "Formula 1", "Chevrolet", "Nissan", "Hyundai", "Toyota", "Triton", "Hilux", "Eon", "Santa Fe", "Mustang", "Jeep", "Sancho Panza", "Demogorgon", "Mark Anthony"};
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

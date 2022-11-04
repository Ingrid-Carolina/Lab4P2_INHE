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
        
        while(centinela == true){
            System.out.println("1)Ejercicio 1- ");
             System.out.println("2)Salir");
             System.out.print("Ingrese la opcion que desea: ");
            int opcion = lea.nextInt();
            switch (opcion){
                case 1:{
                    
                }//fin del case 1
                break;
                
                
                case 2:
                    centinela = false;
                 break;
           
                default:
           System.out.println("Opcion Incorrecta");
            }//fin del switch
    }//fin while
    }
    
}

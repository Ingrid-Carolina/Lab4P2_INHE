/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_ingridhernandez_hectorhernandez;

/**
 *
 * @author ADMINISTRADOR1
 */
public class Jugadores {
    private String Nombre;
    private int Victoria;

    public Jugadores() {
    }

    public Jugadores(String Nombre, int Victoria) {
        this.Nombre = Nombre;
        this.Victoria = Victoria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getVictoria() {
        return Victoria;
    }

    public void setVictoria(int Victoria) {
        this.Victoria = Victoria;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "Nombre=" + Nombre + ", Victoria=" + Victoria + '}';
    }
    
}

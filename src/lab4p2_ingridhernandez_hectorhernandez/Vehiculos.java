/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_ingridhernandez_hectorhernandez;

/**
 *
 * @author ADMINISTRADOR1
 */
public class Vehiculos {
    private String Nombre;
    private int da;
    private int coordX;
    private int coordY;
    private int vida;
    Jugadores j;
    private String TColor;

    public Vehiculos() {
    }

    public Vehiculos(String Nombre, int da, int coordX, int coordY, int vida, Jugadores j, String TColor) {
        this.Nombre = Nombre;
        this.da = da;
        this.coordX = coordX;
        this.coordY = coordY;
        this.vida = vida;
        this.j = j;
        this.TColor = TColor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDa() {
        return da;
    }

    public void setDa(int da) {
        this.da = da;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Jugadores getJ() {
        return j;
    }

    public void setJ(Jugadores j) {
        this.j = j;
    }

    public String getTColor() {
        return TColor;
    }

    public void setTColor(String TColor) {
        this.TColor = TColor;
    }

    @Override
    public String toString() {
        return "Vehiculos{" + "Nombre=" + Nombre + ", da=" + da + ", coordX=" + coordX + ", coordY=" + coordY + ", vida=" + vida + ", j=" + j + ", TColor=" + TColor + '}';
    }
    
    
}
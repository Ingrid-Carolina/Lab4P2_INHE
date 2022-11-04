/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_ingridhernandez_hectorhernandez;

import java.util.ArrayList;

/**
 *
 * @author ADMINISTRADOR1
 */
public class Equipo {
    private String Color;
    private int victoria;
    private ArrayList<Vehiculos> vec = new ArrayList();
    private ArrayList<Jugadores> jud = new ArrayList();

    public Equipo() {
    }

    public Equipo(String Color, int victoria) {
        this.Color = Color;
        this.victoria = victoria;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getVictoria() {
        return victoria;
    }

    public void setVictoria(int victoria) {
        this.victoria = victoria;
    }

    public ArrayList<Vehiculos> getVec() {
        return vec;
    }

    public void setVec(ArrayList<Vehiculos> vec) {
        this.vec = vec;
    }

    public ArrayList<Jugadores> getJud() {
        return jud;
    }

    public void setJud(ArrayList<Jugadores> jud) {
        this.jud = jud;
    }

    @Override
    public String toString() {
        return "Equipo{" + "Color=" + Color + ", victoria=" + victoria + ", vehiculos=" + vec + ", jugadores=" + jud + '}';
    }
    
}

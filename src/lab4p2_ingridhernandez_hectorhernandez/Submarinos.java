package lab4p2_ingridhernandez_hectorhernandez;

/**
 *
 * @author Hector
 */
public class Submarinos extends Vehiculos{
    private int coord_y;

    public Submarinos() {
        super();
    }

    public Submarinos(int coord_y, String Nombre, int da, int coordX, int coordY, int vida, Jugadores j, String TColor) {
        super(Nombre, da, coordX, coordY, vida, j, TColor);
        this.coord_y = coord_y;
    }

    public int getCoord_y() {
        return coord_y;
    }

    public void setCoord_y(int coord_y) {
        if (coord_y >= 0 && coord_y <=9) {
            this.coord_y = coord_y;
        }
    }

    @Override
    public String toString() {
        return super.toString()+"Submarinos{" + "coord_y=" + coord_y + '}';
    }
    
    
    
    
    
}

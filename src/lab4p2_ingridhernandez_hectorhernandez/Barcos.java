package lab4p2_ingridhernandez_hectorhernandez;

/**
 *
 * @author Hector
 */
public class Barcos extends Vehiculos{
    private int coord_y;

    public Barcos() {
        super();
    }

    public Barcos(int coord_y, String Nombre, int da, int coordX, int coordY, int vida, Jugadores j, String TColor) {
        super(Nombre, da, coordX, coordY, vida, j, TColor);
        this.coord_y = coord_y;
    }

    public int getCoord_y() {
        return coord_y;
    }

    public void setCoord_y(int coord_y) {
        if (coord_y >= 1 && coord_y <=8) {
            this.coord_y = coord_y;
        }
        
    }

    @Override
    public String toString() {
        return super.toString()+"Barcos{" + "coord_y=" + coord_y + '}';
    }
    
    
    
    
}

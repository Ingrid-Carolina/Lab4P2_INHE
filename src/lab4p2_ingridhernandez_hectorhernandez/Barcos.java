package lab4p2_ingridhernandez_hectorhernandez;

/**
 *
 * @author Hector
 */
public class Barcos extends Vehiculos{
    private int coord_x;
    private int coord_y;

    public Barcos() {
        super();
    }

    public Barcos(String Nombre, int da, int vida, Jugadores j) {
        super(Nombre, da, vida, j);
    }

    public int getCoord_x() {
        return coord_x;
    }

    public void setCoord_x(int coord_x) {
        this.coord_x = coord_x;
    }

    public int getCoord_y() {
        return coord_y;
    }

    public void setCoord_y(int coord_y) {
        if (coord_y == 1 && coord_y ==8) {
            this.coord_y = coord_y;
        }
    }

    @Override
    public String toString() {
        return super.toString()+"Barcos{" + "coord_x=" + coord_x + ", coord_y=" + coord_y + '}';
    }
    
    public int movimiento(int x2, int y2) {
        int d = (int) Math.sqrt(Math.pow((x2 - this.coord_x),2) + Math.pow((y2 - this.coord_y), 2));
        return d;
    }
    
    
    
}

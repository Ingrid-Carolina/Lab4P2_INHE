package lab4p2_ingridhernandez_hectorhernandez;

/**
 *
 * @author Hector
 */
public class Aviones extends Vehiculos{
    private int coord_x;
    private int coord_y;

    public Aviones() {
        super();
    }

    public Aviones(int coord_x, int coord_y, String Nombre, int da, int coordX, int coordY, int vida, Jugadores j, String TColor) {
        super(Nombre, da, coordX, coordY, vida, j, TColor);
        this.coord_x = coord_x;
        this.coord_y = coord_y;
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
        this.coord_y = coord_y;
    }

    @Override
    public String toString() {
        return super.toString()+"Aviones{" + "coord_x=" + coord_x + ", coord_y=" + coord_y + '}';
    }
    public int movimiento(int x2, int y2) {
        int d = (int) Math.sqrt(Math.pow((x2 - this.coord_x),2) + Math.pow((y2 - this.coord_y), 2));
        return d;
    }
    
    
    
    
    
}

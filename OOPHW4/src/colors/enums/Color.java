package colors.enums;
//Assignment : 4
//Author : Yanir Latyshev 207325093

/**
 * Enum of colors
 */
public enum Color {
    RED(255,0,0),
    GREEN(0, 255, 0),
    BLUE(0,0,255),
    WHITE(255, 255, 0),
    BLACK(0,0,0);

    private int r, g, b;

    /**
     * Constructor for the r,g,b of each color.
     * @param r
     * @param g
     * @param b
     */
    Color(int r, int g, int b){
        this.r = r;
        this.g = g;
        this.b = b;
    }

    /**
     * toString will return the enum value name and its values.
     * @return
     */
    @Override
    public String toString() {
        return this.name()+"(" + r + "," + g + "," + b + ")";
    }
}

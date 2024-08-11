package colors.enums;

//Assignment : 4
//Author : Yanir Latyshev 207325093

import java.util.Arrays;
import java.util.Objects;

public class ColorPalette {
    private Color[] colors;

    public ColorPalette(Color[] colors) {
        this.colors = colors;
    }

    /**
     * checks if the given color name is in Color Enum , if it is it will be returned with all its parameters , else it will return null.
     * @param colorName
     * @return
     */
    public Color getColorByName(String colorName){
        try{
            Color color = Color.valueOf(colorName);
            return color;
        }catch(Exception e){
            return null;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ColorPalette that = (ColorPalette) o;
        return Objects.deepEquals(colors, that.colors);
    }

}

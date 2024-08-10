package colors.enums;


public class ColorPalette {
    private Color[] colors;

    public ColorPalette(Color[] colors) {
        this.colors = colors;
    }

    public Color getColorByName(String colorName){
        try{
            Color color = Color.valueOf(colorName);
            return color;
        }catch(Exception e){
            return null;
        }
    }
}

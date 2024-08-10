package colors.enums;


public class ColorPaletteTest {

    public static void main(String[] args) {
        Color[] colors = Color.values();
        ColorPalette colorPalette = new ColorPalette(colors);
        for(Color cl : colors) {
            System.out.println(colorPalette.getColorByName(cl.name()));
        }



    }
}

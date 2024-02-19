package introtocsHW1.introtocsHW1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 * A visualization for the rocket homework problem.
 *
 * @author Dov Neimand
 */
public class Graphic extends JFrame {

    private MovingPicture picture;

    /**
     * The constructor.
     *
     * @param title The title of the window.
     * @param picture The picture that moves around this frame.
     * 
     */
    public Graphic(String title,  MovingPicture picture) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.picture = picture;

        setSize(600, 400);
        
        buffer = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);

        final int delay = 10;
        new Timer(delay, (ActionEvent e) -> {
            picture.update();
            repaint();
        }).start();

        setVisible(true);
    }

    private final BufferedImage buffer;

    /**
     * Sets the background to black.
     */
    private void setBackground(){
        Graphics2D g2 = buffer.createGraphics();
        g2.setColor(Color.black);
        g2.fillRect(0, 0, getWidth(), getHeight());
    }
    
    @Override
    public void paint(Graphics g) {
        
        setBackground();

        picture.addTo(buffer);

        g.drawImage(buffer, 0, 0, this);

    }

    public static void main(String[] args) {
        new Graphic(
                "Test", 
                new MovingPicture(
                "rocket.png", 
                Math.PI/4, 
                60, 
                30, 
                new Vec2d(0, 400)) {
            @Override
            public void update() {
                loc = new Vec2d(loc.x + 1, loc.y - 1);
            }}
        );
    }
}

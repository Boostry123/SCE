package introtocsHW1;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 * Handles images
 *
 * @author Dov Neimand
 *
 */
public abstract class MovingPicture {

    public final BufferedImage image;
    protected Vec2d loc;
    /**
     * The rotation, height, and width of the image..
     */
    protected double rotate, height, width;

    /**
     * The constructor.
     *
     * @param image The address of the image.
     * @param height The height of the picture.  Pass Double.NaN to use the file
     * height.
     * @param rotation The rotation of the picture.  Pass 0 or Double.NaN if
     * there is no rotation.
     * @param width The width of the picture.  Pass Double.NaN to use the 
     * file width.
     * @param startLoc The starting location of the center of the image.
     * @throws java.io.IOException If the file image is not found.
     */
    public MovingPicture(String image, double rotation, int height,
            int width, Vec2d startLoc) {

        try {
            this.image = ImageIO.read(new File(image));
        } catch (IOException ex) {
            Logger.getLogger(MovingPicture.class.getName()).
                    log(Level.SEVERE, null, ex);
            throw new RuntimeException("File is missing.");
        }
        loc = startLoc;

        this.rotate = rotation;
        this.height = height;
        this.width = width;
    }
   
    /**
     * The x location of the image.
     *
     * @return The x location of the  of the image.
     */
    public Vec2d center() {
        return loc;
    }

    /**
     * The top left corner of the image.
     *
     * @return The top left corner of the image.
     */
    public Vec2d topLeft() {
        Vec2d center = center();
        return new Vec2d(center.x + getWidth()/2, center.y + getHeight()/2);
    }


    /**
     * The width of the image.
     *
     * @return The width of the image.
     */
    public int fileWidth() {
        return image.getWidth();
    }

    /**
     * The height of the image.
     *
     * @return The height of the image.
     */
    public int fileHeight() {
        return image.getHeight();
    }

    /**
     * Does this image have a predefined height seperate from the file height.
     *
     * @return True if there is a separate height. False otherwise.
     */
    public boolean hasHeight() {
        return height != Double.NaN;
    }

    /**
     * Does this image have an artificially set height.
     *
     * @return True if there is an artificially set height, false otherwise.
     */
    public boolean hasWidth() {
        return width != Double.NaN;
    }

    /**
     * The height the image should be set to.
     *
     * @return The height the image should be set to.
     */
    public double getHeight() {
        return height;
    }

    /**
     * The width the image should be set to.
     *
     * @return The width the image should be set to.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Does this shape rotate?
     *
     * @return True if its meant to rotate, false otherwise.
     */
    public boolean rotates() {
        return rotate != 0 && rotate !=  Double.NaN;
    }

    /**
     * The angle of rotation in radians.
     *
     * @return The angle of rotation in radians.
     */
    public double rotation() {
        return rotate;
    }

    /**
     * Draws this image onto the buffered image.
     *
     * @param bi The buffered image that this image is to be added to.
     */
    public void addTo(BufferedImage bi) {
        Graphics2D g2 = bi.createGraphics();
        Vec2d cen = center();
        g2.translate(cen.x, cen.y);
        
        if (rotates()) g2.rotate(rotation());

        double xMult = 1, yMult = 1;
        if (hasWidth()) xMult = getWidth() / fileWidth();
        if (hasHeight()) yMult = getHeight() / fileHeight();
        
        g2.scale(xMult, yMult);

        g2.drawImage(image, -fileWidth()/2, -fileHeight()/2, null);

        g2.dispose();
    }
    
    /**
     * updates the location.
     */
    public abstract void update();

}

package introtocsHW1;

import java.awt.Point;

/**
 *
 * @author Dov Neimand
 */
public class Ball {

    public final double diameter;
    public final Vec2d loc, vel;

    /**
     * The constructor.
     * @param diameter The diameter of the ball.
     * @param loc The location of the ball.
     * @param vel The velocity of the ball.
     */
    public Ball(double diameter, Vec2d loc, Vec2d vel) {
        this.diameter = diameter;
        this.loc = loc;
        this.vel = vel;
    }
    
    /**
     * The constructor.
     * @param diameter The diameter of the ball.
     * @param xLoc The x-location of the ball.
     * @param yLoc The y-location of the ball.
     * @param xVel The x-velocity of the ball.
     * @param yVel The y-velocity of the ball.
     */
    public Ball(double diameter, double xLoc, double yLoc, double xVel, double yVel) {
        this.diameter = diameter;
        this.loc = new Vec2d(xLoc, yLoc);
        this.vel = new Vec2d(xVel, yVel);
    }
    
    /**
     * A constructor
     * @param vals The fields of the ball in the following order: xLoc, yLoc, 
     * xVel, yVel, diameter
     */
    public Ball(double[] vals){
        this(vals[4], vals[0], vals[1], vals[2], vals[3]);
    }

}

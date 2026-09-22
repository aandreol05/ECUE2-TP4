package net.lecnam.ussi2a.tp5;

public class RectangleIncline extends Rectangle {

    double angle;

    public RectangleIncline(double longueur, double largeur,Point origine, double angle) {
        super(longueur, largeur, origine);
        this.angle = angle;
    }

    public RectangleIncline( double longueur, double largeur, double x, double y, double angle) {
        super(longueur, largeur, x, y);
        this.angle = angle;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    @Override
    public String toString() {
        return super.toString() + " [Angle=" + this.angle + "°]";
    }
}
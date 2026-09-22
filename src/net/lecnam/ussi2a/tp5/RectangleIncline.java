package net.lecnam.ussi2a.tp5;

public class RectangleIncline extends Rectangle {

    double angle; // Angle en degrés

    public RectangleIncline(double longueur, double largeur, Point origine, double angle) {
        super(longueur, largeur, origine);
        this.angle = angle;
    }

    public RectangleIncline(double longueur, double largeur, double x, double y, double angle) {
        super(longueur, largeur, x, y);
        this.angle = angle;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public boolean contient(Point point) {
        if (point == null) return false;

        double a = Math.toRadians(this.angle);

        double dx = point.x - this.point.x;
        double dy = point.y - this.point.y;

        double rotx =  dx * Math.cos(a) + dy * Math.sin(a);
        double roty = -dx * Math.sin(a) + dy * Math.cos(a);

        return 0 <= rotx && rotx <= this.longueur
                && 0 <= roty && roty <= this.largeur;
    }

    @Override
    public String toString() {
        return super.toString() + " [Angle=" + this.angle + "°]";
    }
}
package net.lecnam.ussi2a.tp5;

public abstract class Figure {

    public abstract double retourneSurface();
    public abstract double retournePerimetre();
    public abstract void translate(double dx, double dy);
    public abstract boolean contient(Point p);
}

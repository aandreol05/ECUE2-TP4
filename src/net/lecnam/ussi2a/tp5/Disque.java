package net.lecnam.ussi2a.tp5;

public class Disque {

    double rayon;
    Point centre;


    Disque(double rayon, Point centre) {
        this.rayon = rayon;
        this.centre = centre;
    }

    Disque(double rayon, double x, double y) {
        this(rayon, new Point(x, y));
    }

    double retourneSurface(){
        return Math.PI * this.rayon * this.rayon;
    }

    double retournePerimetre(){
        return 2 * Math.PI * this.rayon;
    }

    void translate(double x, double y){
        this.centre.translate(x,y);
    }

    boolean contient(Point point){
        double difX = Math.pow((point.x - this.centre.x),2);
        double difY = Math.pow((point.y - this.centre.y),2);
        double distance = Math.sqrt(difX + difY);
        return distance <= this.rayon ;
    }

    @Override
    public boolean equals(Object object){
        Disque disque = (Disque) object;
        return this.centre.equals(disque.centre)
                && this.rayon == disque.rayon;
    }

    @Override
    public String toString() {
        return "Disque{" +
                "rayon=" + rayon +
                ", Centre=" + centre +
                ", perimètre=" + this.retournePerimetre() +
                ", surface=" + this.retourneSurface() +
                '}';
    }
}

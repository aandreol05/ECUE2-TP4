package net.lecnam.ussi2a.tp5;

public class Disque extends Figure {

    double rayon;
    Point point;


    Disque(double rayon, Point centre) {
        this.rayon = rayon;
        this.point = centre;
    }

    Disque(double rayon, double x, double y) {
        this(rayon, new Point(x, y));
    }

    public double retourneSurface(){
        return Math.PI * this.rayon * this.rayon;
    }

    public double retournePerimetre(){
        return 2 * Math.PI * this.rayon;
    }

    public void translate(double x, double y){
        this.point.translate(x,y);
    }

    public boolean contient(Point point){
        double difX = Math.pow((point.x - this.point.x),2);
        double difY = Math.pow((point.y - this.point.y),2);
        double distance = Math.sqrt(difX + difY);
        return distance <= this.rayon ;
    }

    @Override
    public boolean equals(Object object){
        Disque disque = (Disque) object;
        return this.point.equals(disque.point)
                && this.rayon == disque.rayon;
    }

    @Override
    public String toString() {
        return "Disque{" +
                "rayon=" + rayon +
                ", Centre=" + point +
                ", perimètre=" + this.retournePerimetre() +
                ", surface=" + this.retourneSurface() +
                '}';
    }
}

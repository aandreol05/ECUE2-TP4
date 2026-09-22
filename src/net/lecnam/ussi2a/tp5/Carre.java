package net.lecnam.ussi2a.tp5;

public class Carre extends Figure{

    double cote;
    Point origine;

    public Carre(Point origine, double cote) {
        this.origine = origine;
        this.cote = cote;
    }

    public Carre(double x, double y, double cote) {
        this(new Point(x, y), cote);
    }

    public double retournePerimetre(){
        return 4 * this.cote;
    }

    public double retourneSurface() {
        return this.cote * this.cote;
    }

    public void translate(double dx, double dy) {
        this.origine.translate(dx, dy);
    }

    public boolean contient(Point p) {
        double xMin = this.origine.x;
        double xMax = this.origine.x + this.cote;
        double yMin = this.origine.y;
        double yMax = this.origine.y + this.cote;

        return (p.x >= xMin && p.x <= xMax) && (p.y >= yMin && p.y <= yMax);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Carre carre = (Carre) obj;
        return Double.compare(carre.cote, cote) == 0 &&
                carre.origine.equals(this.origine);
    }

}

package net.lecnam.ussi2a.tp5;

public class Triangle extends Figure{

    Point p1,p2,p3;
    double coteA ;
    double coteB ;
    double coteC ;


    Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.coteA = this.p1.retourneDistance(this.p2);
        this.coteB = this.p2.retourneDistance(this.p3);
        this.coteC = this.p3.retourneDistance(this.p1);
    }

    Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this(new Point(x1, y1), new Point(x2, y2),new Point(x3, y3));
    }


    public double demiPerimetre(Point a, Point b, Point c){
        return (coteA + coteB + coteC) / 2.0;
    }

    public double retournePerimetre(){
        return 2 * demiPerimetre(this.p1, this.p2, this.p3);
    }

    public double retourneSurface(){
        double s = (this.coteA + this.coteB + this.coteC) / 2.0;
        return Math.sqrt(s * (s - this.coteA) * (s - this.coteB) * (s - this.coteC));
    }

    public void translate(double x, double y){
        this.p1.translate(x, y);
        this.p2.translate(x, y);
        this.p3.translate(x, y);
    }

    public boolean contient(Point m){
        if (m == null) return false;

        double airABC = this.retourneSurface();

        double aireABM = new Triangle(this.p1,this.p2,m).retourneSurface();
        double aireACM = new Triangle(this.p1,this.p3,m).retourneSurface();
        double aireBCM = new Triangle(this.p2,this.p3,m).retourneSurface();

        double sommeAir = aireABM + aireACM + aireBCM ;
        return airABC == sommeAir ;
    }

    @Override
    public boolean equals(Object object){
        Triangle triangle = (Triangle) object;
        return this.p1.equals(triangle.p1)
                && this.p2.equals(triangle.p2)
                && this.p3.equals(triangle.p3);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "point1=" + p1 +
                ", Point2=" + p2 +
                ", Point3=" + p3 +
                ", Périmètre=" + this.retournePerimetre() +
                ", Surface=" + this.retourneSurface() +
                '}';
    }
}

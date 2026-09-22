package net.lecnam.ussi2a.tp5;

import org.w3c.dom.css.Rect;

import java.util.Scanner;

public class Exec {

    static Dessin dessin = new Dessin();

    public static void main(String[] args) {

        Rectangle r = new Rectangle(2,3,1.2,9);
        Rectangle r2 = new Rectangle(2,4,0,0);
        Disque d = new Disque(5,2,4);
        Disque d2 = new Disque(8,5,3);
        Triangle t = new Triangle(2,5,6,1,4,7);
        Triangle t2 = new Triangle(1.5,5.2,8.4,2.4,2.8,1.9);

        dessin.ajout(r);
        dessin.ajout(r2);
        dessin.ajout(d);
        dessin.ajout(d2);
        dessin.ajout(t);
        dessin.ajout(t2);

        System.out.println(dessin.retourneSurfaceTotale());
        System.out.println(dessin.retournePlusGrand());

        //Point p = new Point(5,9);

        for (int i = 0 ; i < dessin.nbFigures; i++){
            System.out.println("Figure " + (i+1) + " : " + dessin.figures[i]);
        }

    }


}

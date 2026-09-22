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

        dessin.ajout(r);
        dessin.ajout(r2);
        dessin.ajout(d);
        dessin.ajout(d2);

        System.out.println(dessin.retournePlusGrand());
        System.out.println(dessin.retourneSurfaceTotale());


    }


}

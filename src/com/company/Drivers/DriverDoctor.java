package com.company.Drivers;

import com.company.Doctor;
import com.company.Stubs.StubDoctor;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Vector;

/**
 * Created by xavivaio on 31/10/2014.
 */
public class DriverDoctor {

    private Doctor d;

    public DriverDoctor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tria que vols fer entre les seguents opcions:\n");
        System.out.print("A) Afegir un doctor stub\n");
        System.out.print("B) Borrar un doctor stub\n");
        System.out.print("C) Afegir restriccions a un doctor stub\n");
        System.out.print("D) Visualitzar info doctor\n");
        System.out.print("E) Sortir\n");
        String choice;
        choice = sc.next();

        while (!choice.equals("E")) {
            if (choice.equals("A")) {
                d = new Doctor();
                d.add_data(StubDoctor.nom, StubDoctor.dni, StubDoctor.sou);
            } else if (choice.equals("B")) {
                d = new Doctor();
            } else if (choice.equals("C")) {

                Vector<SimpleDateFormat> dateFormats = new Vector<SimpleDateFormat>();
                dateFormats.add(new SimpleDateFormat("31/11/2014"));
                dateFormats.add(new SimpleDateFormat("01/12/2014"));
                dateFormats.add(new SimpleDateFormat("02/12/2014"));
                dateFormats.add(new SimpleDateFormat("03/12/2014"));
                dateFormats.add(new SimpleDateFormat("04/12/2014"));

                Scanner sc2 = new Scanner(System.in);
                System.out.print("Escriu R per relativa o A per absoluta" + "\n");
                String resposta = sc2.next();
                if (resposta.equals("A")) d.add_restriccio(dateFormats, 0);
                else d.add_restriccio(dateFormats, 3);
            } else if (choice.equals("D")) {
                if (d.get_sou() != -1) {
                    d.write_info();
                } else {
                    System.out.print("No hi ha cap doctor" + "\n");
                }
            }
            choice = sc.next();
        }
    }
}

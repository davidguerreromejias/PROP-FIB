package com.company;

import java.util.List;
import java.util.Scanner;

public class Main {
    private List<Doctor> doctors;
    private Calendari calendari;

    public static void main(String[] args) {
	// write your code here
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
                d.set_restriccio(StubDoctor.dia, StubDoctor.mes);
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

package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Created by xavivaio on 24/10/2014.
 */
public class Doctor {
    private String nom;
    private String dni;
    private int sou;
    private List restriccions;

    public Doctor(){
        nom = null;
        dni = null;
        sou = -1;
    }

    public void add_data(String nom, String dni, int sou){
        this.nom = nom;
        this.dni = dni;
        this.sou = sou;
        restriccions = new ArrayList();
    }

    public boolean add_restriccio(Vector dies, int dies_a_treballar) {

        //Potser sobra boolea, no esta controlat

        boolean b;
        if (dies_a_treballar == 0){
            b = restriccions.add(new ResAbsoluta(dies));
        } else {
            b = restriccions.add(new ResRelativa(dies, dies_a_treballar));
        }
        return b;
    }

    public String get_dni() {return dni;}
    public int get_sou() {return sou;}
    public String get_nom() {return nom;}
    public List get_restriccions() {return restriccions;}

    public void write_info(){
        System.out.print(nom + "\n");
        System.out.print(dni + "\n");
        System.out.print(sou + "\n");
        restriccio.write_info();
    }
}

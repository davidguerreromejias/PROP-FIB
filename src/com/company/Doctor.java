package com.company;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * Created by xavivaio on 24/10/2014.
 */
public class Doctor {
    private String nom;
    private String dni;
    private int sou;
    private List<Restriccio> restriccions;

    public Doctor(){
        nom = null;
        dni = null;
        sou = -1;
    }

    public void add_data(String nom, String dni, int sou){
        this.nom = nom;
        this.dni = dni;
        this.sou = sou;
        restriccions = new ArrayList<Restriccio>();
    }

    public void add_restriccio(Vector<SimpleDateFormat> dies, int dies_a_treballar) {
        if (dies_a_treballar == 0){
            restriccions.add(new ResAbsoluta(dies));
        } else {
            restriccions.add(new ResRelativa(dies, dies_a_treballar));
        }
    }

    public String get_dni() {return dni;}
    public int get_sou() {return sou;}
    public String get_nom() {return nom;}
    public List get_restriccions() {return restriccions;}

    public void write_info(){
        System.out.print(nom + "\n");
        System.out.print(dni + "\n");
        System.out.print(sou + "\n");
        for (Restriccio restriccio : restriccions) {
            restriccio.write_info();
        }
    }
}

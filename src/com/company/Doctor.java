package com.company;

import java.util.List;

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
    }

    public void add_restriccio(List<Integer> dies, int dies_a_treballar) {

        Restriccio restriccio = new Restriccio(List<Integer> dies, int dies_a_treballar);
        restriccions.add(dia, mes);
    }

    public String get_dni() {return dni;}
    public int get_sou() {return sou;}
    public String get_nom() {return nom;}
    public Restriccio get_restriccions() {return restriccions;}

    public void write_info(){
        System.out.print(nom + "\n");
        System.out.print(dni + "\n");
        System.out.print(sou + "\n");
        restriccio.write_info();
    }
}

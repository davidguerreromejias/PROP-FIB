package com.company;

import java.util.*;

/**
 * Created by xavivaio on 24/10/2014.
 */
public class Calendari {

    private Dia[] calendari;
    private Hashtable torns_vacances;

    Calendari(){
        calendari = new Dia[365];
        torns_vacances = new Hashtable();
    }

    public void load_calendari(){
        //carregar
    }

    public void save_calendari(){
        //guradar
    }

    public int transformar(int dia, int mes){
        int result = 0;

        while (mes > 12 || mes < 1 || dia > 31 || dia < 1 || (mes == 2 && dia > 28)){
            System.out.print("Sisplau introdueix una data valida, primer el dia i despres el mes" + "\n");
            Scanner scanner = new Scanner(System.in);
            String sdia = scanner.next();
            String smes = scanner.next();
            dia = Integer.parseInt(sdia);
            mes = Integer.parseInt(sdia);
        }
        if (mes == 1) result = 0;             //gener
        else if (mes == 2) result = 31;        //febrer
        else if (mes == 3) result = 59;        //març
        else if (mes == 4) result = 90;        //abril
        else if (mes == 5) result = 120;        //maig
        else if (mes == 6) result = 151;        //juny
        else if (mes == 7) result = 181;        //juliol
        else if (mes == 8) result = 212;        //agost
        else if (mes == 9) result = 243;        //septembre
        else if (mes == 10) result = 273;       //octubre
        else if (mes == 11) result = 304;       //novembre
        else if (mes == 12) result = 334;       //desembre

        result += dia;
        return result;
    }

    //helper methods
    private void add_torn_vacances(String nom_torn, int dia_inicial, int dia_final){
        torns_vacances.put(nom_torn, new PairDies(dia_inicial, dia_final));
    }

}

package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;

/**
 * Created by xavivaio on 24/10/2014.
 */
public abstract class Restriccio {
    Vector<SimpleDateFormat> dies;

    //No te constructor pq mai crearem un objecte d'aquest tipus
    //Al escriure pot sonar problemes si no es tracta d'un vector de numeros

    public void write_info(){
        dies.trimToSize();
        if(this instanceof ResRelativa) {
            System.out.print("Restriccio relativa:" + "\n");
            int x = ((ResRelativa) this).getDies_a_treballar();
            System.out.print("Es treballaran " + x + " dies dels segunets:" + "\n");
        }
        else {
            System.out.print("Restriccio absoluta:" + "\n");
        }
        for(SimpleDateFormat simple : dies){
            String data = simple.format(new Date());
            System.out.print(data + "\n");

        }
    }
}

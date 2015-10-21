package com.company;

import java.text.SimpleDateFormat;
import java.util.Vector;

/**
 * Created by xavivaio on 24/10/2014.
 */
public class ResRelativa extends Restriccio {
    private int dies_a_treballar;

    public ResRelativa(Vector<SimpleDateFormat> dies, int dies_a_treballar){
        this.dies = dies;
        this.dies_a_treballar = dies_a_treballar;
    }

    public int getDies_a_treballar(){return dies_a_treballar;}

}

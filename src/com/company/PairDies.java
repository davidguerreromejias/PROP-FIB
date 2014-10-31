package com.company;

/**
 * Created by xavivaio on 24/10/2014.
 */
public final class PairDies {
        private final int dia_inicial;
        private final int dia_final;

        public PairDies(int dia_inicial, int dia_final)
        {
            this.dia_inicial = dia_inicial;
            this.dia_final = dia_final;
        }

        public int getDia_inicial()   { return dia_inicial; }
        public int getDia_final() { return dia_final; }
}

package com.company;

import java.text.SimpleDateFormat;

/**
 * Created by xavivaio on 24/10/2014.
 */
public final class PairDies {
        private final SimpleDateFormat dia_inicial;
        private final SimpleDateFormat dia_final;

        public PairDies(SimpleDateFormat dia_inicial, SimpleDateFormat dia_final)
        {
            this.dia_inicial = dia_inicial;
            this.dia_final = dia_final;
        }

        public SimpleDateFormat getDia_inicial()   { return dia_inicial; }
        public SimpleDateFormat getDia_final() { return dia_final; }
}

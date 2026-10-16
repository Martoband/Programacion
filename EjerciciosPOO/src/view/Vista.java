package view;

import model.Coche;

public class Vista {
    public void muestraCoche (Coche coche){

        System.out.printf("%s - %s - %d \n",coche.getMarca(), coche.getModelo(), coche.getAnio());
    }
}

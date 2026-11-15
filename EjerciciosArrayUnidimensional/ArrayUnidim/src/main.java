import utils.Operaciones;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /*int contador =0;
        int[] array = new int[]{5,7,8,6,9,4,2,5,6};
        for (int numeroActual : array){
            System.out.println(numeroActual);
            array[contador] *=2;
            numeroActual =numeroActual*2;
            contador++;
        }
        for (int numeroActual : array){
            System.out.println(numeroActual);
        }*/

        Operaciones op = new Operaciones(7);
        op.rellenarDatos(3);
        System.out.println(Arrays.toString(op.getNumeros()));
       /* op.bubbleMayor();
        System.out.println(Arrays.toString(op.getNumeros()));
        op.bubbleMenor();
        System.out.println(Arrays.toString(op.getNumeros()));*/
        op.invertirValores();
        System.out.println(Arrays.toString(op.getNumeros()));
        op.rotarDcha();
        System.out.println(Arrays.toString(op.getNumeros()));


    }
}

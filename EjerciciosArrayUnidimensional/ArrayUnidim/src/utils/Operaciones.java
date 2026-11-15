package utils;

import java.util.Arrays;

public class Operaciones {
    private int[] numeros;
    private int alpha;
    private boolean intercambio;
    private int[] auxiliares;

    public Operaciones() {
    }


    public Operaciones(int numero) {
        numeros = new int[numero];
    }

    // modificacion - rellenado de datos
    public void rellenarDatos(int alpha) {
        for (int i = 0; i < numeros.length; i++) {
            int aleatorio;
            do {
                aleatorio = (int) (Math.random() * (numeros.length * alpha));
            } while (estaNumero(aleatorio));
            numeros[i] = aleatorio;
        }
    }

    public boolean tamanyoEsPar() {
        if (numeros.length % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void bubbleMayor() {
        for (int i = 0; i < numeros.length; i++) {
            int aux;
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                    intercambio = true;
                    if (!intercambio) {
                        break;
                    }
                }


            }
        }
    }

    public void bubbleMenor() {
        for (int i = 0; i < numeros.length; i++) {
            int aux;
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] < numeros[j + 1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                    intercambio = true;
                    if (!intercambio) {
                        break;
                    }
                }
            }
        }
    }

    public void invertirValores() {
        int j = numeros.length - 1;

        for (int i = 0; i < numeros.length / 2; i++) {
            int aux = numeros[i];
            numeros[i] = numeros[j];
            numeros[j] = aux;
            j--;
        }


    }

    // sustituid valores -> el usuario indica un valor, en caso de estar se sustituye por otro que indique el usuario
    public void cambiarNumeros(int nCambiar, int nCambio) {
        for (int i = 0; i < numeros.length; i++) {
            /*if (numeros[i] == nCambiar) {
                numeros[i] = nCambio;
            }*/
            numeros[i] = nCambiar == numeros[i] ? nCambio : numeros[i];
        }
    }

    // busqueda en array
    public boolean estaNumero(int numero) {
        for (int item : numeros) {
            if (item == numero)
                return true;
        }

        return false;
    }

    public void ordenar() {
        Arrays.sort(numeros);
    }
public void rotarDcha(){
        int aux = numeros[numeros.length-1];
    for (int i = numeros.length-2; i >= 0 ; i--) {
        numeros[i+1]=numeros[i];
    }
    numeros[0]=aux;
}
    public void rotarIzq() {
        int aux = numeros[0];
        for (int i = 0; i < numeros.length - 1; i++) {
            numeros[i] = numeros[i + 1];
        }
        numeros[numeros.length - 1] = aux;
    }


    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
}
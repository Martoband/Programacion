//TODO : CUADRADO (4*4) que se genere aleatorio, si la suma de las cada una de las filas && la suma de cada una de las columnas && la suma de las dos diagonales da lo mismo, da cuadrado mágico. Sino, volver a generar.
//Opciones: Dar numero de repeticiones hasta esCuadradoMagico. hacer métod0 rellenarSinRepetir para que evite repeticiones.
//Opciones: que el usuario elija si quiere que el sistema repita de forma interminable hasta conseguir cuadrado mágico, o si quiere hacer un número de repeticiones X.

import utils.DiferenteExteption;

public class CuadradoMagico {
    private int[][] cuadrado;
    private int row;
    private int col;
    private int referencia = -1;
    private int sumaRow;
    int sumaCol;
    int sumaDiag1;
    int sumaDiag2;

    public boolean esCuadrado(int row, int col) {
        if (row == col) {
            return true;
        } else {
            return false;
        }
    }

    //TODO, repasar las exception para que lance exception si no son iguales los cuadrados
    public void setCuadrado(int row, int col) throws DiferenteExteption {
        if (row != col) {
            throw new DiferenteExteption("Para ser cuadrado, las filas y las columnas deben ser iguales");
        }
        this.col = col;
        this.row = row;
        cuadrado = new int[row][col];

    }

    public void rellenarCuadrado() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                cuadrado[i][j] = (int) (Math.random() * Math.pow(row, 2.0));
            }
        }
    }

    public boolean esMagico() {
        boolean igualCol;
        boolean igualRow;

            sumaDiag1=0;
            sumaDiag2=0;
            for (int i = 0; i < row; i++) {
                sumaRow=0;
                sumaCol=0;
                for (int j = 0; j < col; j++) {
                    sumaRow += cuadrado[i][j];
                    sumaCol += cuadrado[j][i];

                }
                if (i == 0) {
                    referencia = sumaRow;
                }
                igualCol = referencia == sumaCol ? true : false;
                igualRow = referencia == sumaRow ? true : false;
                if (!igualCol || !igualRow) {
                    System.out.println("false");
                    return false;
                }
                sumaDiag1+=cuadrado[i][i];
                sumaDiag2+=cuadrado[i][row-i-1];
            }
            if(sumaDiag1==referencia && sumaDiag2==referencia){
                System.out.println("true");
                return true;
            }else{
                System.out.println("false");
                return false;
    }}


/*public void rellenarSinRepetir(){//TODO Solucion chunga, crear un array unidimensional de tamaño row*col que guarde cada numero aleatorio y lo busque en cada iteración
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

            }

        }
    }
}*/

    public void mostrarCuadrado() {
        for (int[] row : cuadrado) {
            System.out.print("{");
            for (int item : row) {
                System.out.print(" " + item);
            }
            System.out.println("}");
        }
    }

}

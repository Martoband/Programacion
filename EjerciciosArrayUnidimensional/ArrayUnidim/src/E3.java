import java.util.Scanner;

//TODO AQUI ESTÁN LOS EJERCICIOS DESDE EL 2 HASTA 9, pero sin String
public class E3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mayorPrimero = 0,mayorSegundo =0,vecesEncontradoPrimero =0 ,vecesEntontradoSegundo=0 , cont50Array1=0,cont50Array2=0,vuelta1=0,vuelta2=0,j = 0;
        int menorPrimero=Integer.MAX_VALUE, menorSegundo = Integer.MAX_VALUE;
        int contador1=1, contador2 = 1;
        double suma1=0, suma2 = 0;
        boolean primeroEncuentra=false, segundoEncuentra = false;
        int x, y;
        do {
            System.out.println("De cuantos numeros quieres tu primer array?");
            x = sc.nextInt();
        } while (x <= 0);
        int[] primero = new int[x];
        int[] invertido = new int[x];
        do {
            System.out.println("De cuantos numeros quieres el segundo array?");
            y = sc.nextInt();
        } while (y <= 0);
        int[] segundo = new int[y];
        int[] invertidoSegundo = new int[y];
        for (int i = 0; i < Math.min(x, y); i++) {
            System.out.println("Dime la " + (i + 1) + "ª posición del primer array");
            primero[i] = sc.nextInt();
            if (primero[i] > mayorPrimero) {
                mayorPrimero = primero[i];
            }
            if (primero[i] < menorPrimero) {
                menorPrimero = primero[i];
            }
            suma1 += primero[i];
            System.out.println("Dime la " + (i + 1) + "ª posición del segundo array");
            segundo[i] = sc.nextInt();
            if (segundo[i] > mayorSegundo) {
                mayorSegundo = segundo[i];
            }
            if (segundo[i] < menorSegundo) {
                menorSegundo = segundo[i];
            }
            suma2 += segundo[i];

        }
        if (Math.min(x, y) == x) {
            for (int i = primero.length; i < segundo.length; i++) {
                System.out.println("Dime la " + (i + 1) + "ª posición del segundo array");
                segundo[i] = sc.nextInt();
                suma2 += segundo[i];
                if (segundo[i] > mayorSegundo) {
                    mayorSegundo = segundo[i];
                }
                if (segundo[i] < menorSegundo) {
                    menorSegundo = segundo[i];
                }
            }
        } else {
            for (int i = segundo.length; i < primero.length; i++) {
                System.out.println("Dime la " + (i + 1) + "ª posición del primer array");
                primero[i] = sc.nextInt();
                if (primero[i] > mayorPrimero) {
                    mayorPrimero = primero[i];
                }
                if (primero[i] < menorPrimero) {
                    menorPrimero = primero[i];
                }
                suma1 += primero[i];
            }
        }
        System.out.println("Introduce el numero a buscar");
        int buscar = sc.nextInt();
        for (int i = invertidoSegundo.length; i > 0 ; i--) {
            invertidoSegundo[i-1]=segundo[j];
            j++;

        }
        for (int numero : primero) {
            invertido[x - contador1] = numero;
            if (numero > 50) {
                cont50Array1 += 1;
            }
            if (buscar == numero) {
                vecesEncontradoPrimero++;
                if (!primeroEncuentra) {
                    primeroEncuentra = true;
                    vuelta1 = contador1;
                }
            }

            contador1 += 1;
        }
        for (int numero : segundo) {
            if (numero > 50) {
                cont50Array2 += 1;
            }
            if (buscar == numero) {
                vecesEntontradoSegundo++;
                if (!segundoEncuentra) {
                    segundoEncuentra = true;
                    vuelta2 = contador2;
                }

            }

            contador2 += 1;
        }

        if (primeroEncuentra) {
            System.out.printf("El numero %d se ha encontrado en el primer array en la posicion %d la primera vez, y se ha encontrado %d veces%n", buscar, vuelta1, vecesEncontradoPrimero);
        } else {
            System.out.println("El numero " + buscar + " no se encuentra en el primer array");
        }
        if (segundoEncuentra) {
            System.out.printf("El numero %d se ha encontrado en el segundo array en la posicion %d la primera vez, y se ha encontrado %d veces%n", buscar, vuelta2, vecesEntontradoSegundo);
        } else {
            System.out.println("El numero " + buscar + "no se encuentra en el segundo array");
        }
        System.out.println("La suma de los valores del primer array son " + suma1);
        System.out.println("El promedio de los valores del primer array son " + (suma1 / primero.length));
        System.out.println("La suma de los valores del segundo array son " + suma2);
        System.out.println("El promedio de los valores del segundo array son " + (suma2 / segundo.length));
        System.out.println("La cantidad de valores que sobrepasan 50 en el primer array son " + cont50Array1);
        System.out.println("La cantidad de valores que sobrepasan 50 en el segundo array son " + cont50Array2);
        System.out.println("El mayor numero del primer array es " + mayorPrimero);
        System.out.println("El mayor numero del segundo array es " + mayorSegundo);
        System.out.println("El menor numero del primer array es " + menorPrimero);
        System.out.println("El menor numero del segundo array es " + menorSegundo);
        for (int numero : invertido) {
            System.out.println(numero);
        }
        for(int numero :invertidoSegundo){
            System.out.println(numero);
        }
    }


}


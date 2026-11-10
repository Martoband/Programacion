import java.util.Scanner;

public class EjercicioBonoloto {
    // generar un carton de bonoloto -> 5 numeros entre el 1 - 100 sin que se puedan repetir TODO -> Utilizado el método creado por Borja con el SOUT comentado
    // TODO -> pedir al usuario 5 numeros, que no sean repetidos,
    //  añadido mensaje de nº de aciertos y caso de acierto total
    // decidir cuantos he acertado -> coincide valor y posicion
    public static void main(String[] args) {
        int[] cartonBonoloto = new int[5];
        for (int i = 0; i < cartonBonoloto.length; i++) {
            int aleatorio;
            do {
                aleatorio = (int) (Math.random() * 99) + 1; //
            } while (estaNumero(cartonBonoloto, aleatorio));
            cartonBonoloto[i] = aleatorio;
        }

        for (int item : cartonBonoloto) {
            System.out.print(item + " ");
        }

        int contador = 0;
        int[] cartonUsuario = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < cartonUsuario.length; i++) {
            int num ;
            do{
                System.out.println("Dime tus 5 numeros de la bonoloto (sin repetir). "+(i+1)+" Numero");
                num=sc.nextInt();

            }while (estaNumero(cartonUsuario,num));
            cartonUsuario[i]=num;

        }

      /*  for comparativo con if ternario con instrucción simple
      for (int i = 0; i < cartonBonoloto.length; i++) {
            String resultado = cartonUsuario[i]==cartonBonoloto[i] ? "Acertado en "+i+" posicion" : "No has acertado en "+i+" posicion";
            System.out.println(resultado);
        }*/

        for (int i = 0; i < cartonBonoloto.length; i++) {
            if(cartonBonoloto[i]==cartonUsuario[i]){
                System.out.println("Has acertado el "+(i+1)+"º número");
                contador++;
            }
        }
        String texto = contador == cartonBonoloto.length ? "Has ganado la bonoloto" : "Más suerte la próxima vez";
        System.out.println(texto);
    }


    public static boolean estaNumero(int[] carton, int numero) {
        for (int item : carton) {
            if (item == numero) {
               // System.out.println("Repetido");
                return true;
            }
        }
        return false;
    }

}


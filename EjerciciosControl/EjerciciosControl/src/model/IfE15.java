package model;

import java.util.Scanner;

public class IfE15 {
    public static void main(String[] args) {
        double peso;
        double distancia;
        double exceso;
        double recargoUrgencia=0.5;
        boolean urgente;
        boolean excedePeso;
        boolean excedeDistancia;
        double costeDistancia=10;
        double precio = 5;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el peso del paquete (kg)");
        peso = sc.nextDouble();
        System.out.println("Introduce la distancia del envío (km)");
        distancia = sc.nextDouble();
        System.out.println("El envío es urgente?(true/false)");
        urgente = sc.nextBoolean();
        excedePeso=peso>5;
        excedeDistancia=distancia>100;
        System.out.printf("Precio base: %.1f€%n",precio);
        if(excedePeso){
            exceso = (peso-5);
            System.out.printf("Peso: %.1f kg (excede 5kg en %.1fkg)%n",peso,exceso);
            exceso*=2;
            System.out.printf("Coste adicional por peso: $.1f€%n", exceso);
            precio+=exceso;
            System.out.println("Subtotal:"+precio);

        }else{
            System.out.println("Peso dentro de la norma. Sin sobrecoste");
            System.out.println("Subtotal:"+precio);
        }
        if(excedeDistancia){
            System.out.printf("Distancia: %.1fkm (mayor de 100 km)%n",distancia);
            System.out.printf("Coste adicional por distancia %.2f€%n",costeDistancia);
            precio+=costeDistancia;
            System.out.println("Subtotal:"+precio);
        }else{
            System.out.println("La distancia está dentro de la norma. Sin sobrecoste");
            System.out.println("Subtotal:"+precio);
        }
        if(urgente){
            double total= precio*recargoUrgencia;
            precio+=total;
            System.out.println("Es envío urgente?"+urgente);
            System.out.printf("Recargo por urgencia (x1.5): %.1f€%n",total);
        }
        System.out.printf("Coste total del envío: %.1f",precio);
    }
}

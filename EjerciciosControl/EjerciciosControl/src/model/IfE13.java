//Este lo he hecho fuera de IntelliJ, así que igual tiene algun fallo de escritura
public class IfE13{
import java.util.Scanner;
public static void main (String[] args){

Scanner sc = new Scanner (System.in);
int edad;
int dia;
double precio;
boolean menores;
boolean adolescentes;
boolean adultos;
boolean esDia;

System.out.println("Introduce tu edad");
edad = sc.nextInt();
System.out.println("Introduce el dia de la semana (en numero):");
System.out.println("1-Lunes");
System.out.println("2-Martes");
System.out.println("3-Miercoles");
System.out.println("4-Jueves");
System.out.println("5-Viernes");
System.out.println("6-Sabado");
System.out.println("7-Domingo");
dia = sc.nextInt();
sc.close();

System.out.println("Edad:" +edad);
Sustem.out.printf("Día de la semana: (%d) - %s ",dia, diaString);
menores = edad<12;
adolescentes = edad>12 && edad<17;
adultos = edad>18 && edad<64
esDia = dia==2 || dia==4;
System.out.println("¿Eres menor de 12 años?" +menores);
if(menores){
precio=0}
else if(adolescentes){
	System.out.println("¿Tienes entre 12 y 17 años?" +adolescentes);
	if(esDia){
		System.out.println("¿Es martes?" +esDia);
		precio=0;
			  }else{
		System.out.println("¿Es martes?" +esDia);
			  }
	precio=5;}
else if(adultos){
	System.out.println("¿Tienes entre 18 y 64 años?" +adultos);
	if(esDia){
		System.out.println("¿Es jueves?" +esDia);
		precio=7;}else{
		System.out.println("¿Es jueves?" +esDia);
		}
	precio=10;}
else{
precio=6;
}
	}

}

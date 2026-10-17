import controller.Controller;
import model.CuentaBancaria;
import view.Vista;

public class main {
    public static void main(String[] args) {
CuentaBancaria c1 = new CuentaBancaria("Andreu Martinez", 5000);
CuentaBancaria c2 = new CuentaBancaria("Pablo Martinez", 5000);
CuentaBancaria c3 = new CuentaBancaria("Andreu Hernandez", 5000);
CuentaBancaria c4 = new CuentaBancaria("Pedro Martinez", 5000);
CuentaBancaria c5 = new CuentaBancaria("Roberto Hernandez", 5000);
        Vista vista = new Vista();
Controller banco = new Controller(vista);
/*
banco.consultaSaldo(c1);
banco.transferenciaSaldo(c2,3000,c3);
banco.ingresoSaldo(c4,750);
banco.consultaSaldo(c4);
banco.transferenciaSaldo(c4,1500,c5);
banco.consultaCuenta(c5);
banco.consultaCuantos();
        System.out.println("");
        System.out.println("");*/
banco.retiradaDinero(c1,350);
banco.consultaSaldo(c1);
banco.cambioLimite(c1,500);
banco.cambioLimite(c2,0);
    }
}

package view;
import model.*;
public class Vista {

    public void mostrarNombre (CuentaBancaria cuenta){
       System.out.printf("Tu cliente se llama %s %n",cuenta.getCliente());
    }
    public void mostrarID(CuentaBancaria cuenta){
        System.out.printf("La cuenta es %s %n",cuenta.getCuenta());
    }
    public void mostrarSaldo (CuentaBancaria cuenta){
        System.out.printf("Saldo actual %.2f %n",cuenta.getSaldo());
    }
    public void mostrarInteres (CuentaBancaria cuenta){
        System.out.printf("Tienes %.2f interés %n",cuenta.getInteres());
    }
    public void mostrarCuantos (int cuantos){
        System.out.printf("Tienes %d clientes %n",cuantos);
    }
    public void ingresoRealizado (CuentaBancaria cuenta){
        System.out.println("Ingreso realizado Correctamente");
    }
    public void mostrarTransferenciaSalida(CuentaBancaria cuenta, double euros){
        System.out.printf("Transferencia de %.2f € a la cuenta %s realizada %n",euros, cuenta.getCuenta());
    }
    public void mostrarTransferenciaEntrada(CuentaBancaria cuenta, double euros){
        System.out.printf("Transferencia recibida de %.2f € de la cuenta %s %n",euros, cuenta.getCuenta());
    }
    public void mostrarTransferenciaError(CuentaBancaria cuenta){
        System.out.println("No se ha podido realizar la transferencia");
    }
    public void mostrarErrorCantidad(double euros){
        System.out.printf("La cantidad introducida '%.2f' no es válida. No se pueden transferir cantidades negativas ni inexistentes.%n",euros);
    }
    public void mostrarErrorDestino(CuentaBancaria cuenta){
        System.out.println("La cuenta de destino no existe o no se puede usar");
    }
    public void mostrarErrorSaldo(double euros, CuentaBancaria cuenta){
        System.out.printf("No puedes realizar una transferencia de %.2f €, tu saldo es de %.2f €%n",euros, cuenta.getSaldo());
    }
    public void mostrarRetirada(double euros, CuentaBancaria cuenta){
        System.out.printf("Has retirado %.2f€, de la cuenta %s%n",euros, cuenta.getCuenta());
    }
    public void mostrarLimiteSuperado(double euros){
        System.out.printf("Has superado el límite de 300€%n");
    }
    public void mostrarCambioLimite(int euros){
        System.out.printf("El nuevo limite por retirada es de %d € %n",euros);
    }
    public void mostrarNoCambioLimite(int euros){
        System.out.printf("Límite propuesto: %d. %nNo se ha producido cambio porque el nuevo límite no cumple las condiciones (<0).%n",euros);
    }


}


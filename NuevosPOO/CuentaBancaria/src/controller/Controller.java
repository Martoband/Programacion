package controller;

import model.CuentaBancaria;
import model.Resultados;
import view.Vista;

public class Controller {
private Vista vista;

public Controller (Vista vista){
    this.vista=vista;
}
public void consultaSaldo(CuentaBancaria cuenta){
 vista.mostrarSaldo(cuenta);
}

public void consultaCliente(CuentaBancaria cuenta){
    vista.mostrarNombre(cuenta);

}
public void consultaCuenta(CuentaBancaria cuenta){
    vista.mostrarID(cuenta);
}
public void consultaIntereses(CuentaBancaria cuenta){
    vista.mostrarInteres(cuenta);
}
public void ingresoSaldo(CuentaBancaria cuenta , double euros){

    cuenta.entradaDinero(euros);
    vista.ingresoRealizado(cuenta);
    vista.mostrarSaldo(cuenta);
}
public void retiradaDinero(CuentaBancaria cuenta, double euros){
    Resultados resultado = cuenta.salidaDinero(euros);
    switch (resultado){
        case CORRECTA -> {
            vista.mostrarRetirada(euros,cuenta);
            vista.mostrarSaldo(cuenta);
        }
        case CANTIDAD_NO_VALIDA -> {
            vista.mostrarErrorCantidad(euros);
        }
        case SALDO_INSUFICIENTE -> {
            vista.mostrarErrorSaldo(euros, cuenta);
        }
        case LIMITE_SUPERADO -> {
            vista.mostrarLimiteSuperado(euros);
        }
    }

}
public void cambioLimite (CuentaBancaria cuenta, int euros){

    if(cuenta.setLimite(euros)){
        vista.mostrarCambioLimite(euros);
    }else{
    vista.mostrarNoCambioLimite(euros);
}}
public void transferenciaSaldo(CuentaBancaria cuenta, double euros, CuentaBancaria otro){
    Resultados resultado = cuenta.transferencia(euros,otro);
    switch (resultado){
        case CORRECTA:
            vista.mostrarTransferenciaSalida(cuenta,euros);
            vista.mostrarSaldo(cuenta);
            vista.mostrarTransferenciaEntrada(otro,euros);
            vista.mostrarSaldo(otro);
            break;
        case CANTIDAD_NO_VALIDA:
            vista.mostrarErrorCantidad(euros);
            break;

        case DESTINATARIO_NO_VALIDO:
            vista.mostrarErrorDestino(otro);
            break;

        case SALDO_INSUFICIENTE:
            vista.mostrarErrorSaldo(euros,cuenta);

            break;
    }
}
}
/*public void consultaCuantos (){
    vista.mostrarCuantos(CuentaBancaria.getCuantos());
}*/



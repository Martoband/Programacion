package model;

public class CuentaBancaria {
    private String cuenta, cliente;
    private double interes, saldo;
    private static int cuantos=0;
    private int limite = 300;


    public CuentaBancaria(String cliente, double saldo) {
        cuenta = cliente.substring(0, 2).toUpperCase() + ((int) (Math.random() * 90000000) + 10000000)/100;
        this.cliente = cliente;
        this.saldo = saldo;
        interes = 2.0;
        cuantos++;
    }
    public String getCliente (){
        return cliente;
    }
    public static int getCuantos(){
        return cuantos;
    }
    public String getCuenta () {
        return cuenta;
    }
    public double getInteres() {
        return interes;
    }
    public double getSaldo() {
        return saldo;
    }
    public boolean setLimite (int limite){
        if(limite<1){
            return false;
        }
        this.limite=limite;
        return true;
    }
    public void setCliente (String cliente){
        this.cliente = cliente;
    }
    public void setInteres (Double interes){
        this.interes=interes;
    }
    public void entradaDinero(double euros){
        saldo+=euros;
    }
    public Resultados salidaDinero(double euros){
       if(euros <=0){
           return Resultados.CANTIDAD_NO_VALIDA;
           }
       if(euros>saldo){
           return Resultados.SALDO_INSUFICIENTE;
            }
       if(euros>limite){
           return Resultados.LIMITE_SUPERADO;
       }
       saldo-=euros;
       return Resultados.CORRECTA;
    }
    public Resultados transferencia(double euros, CuentaBancaria otro){
        if (euros<=0){
            return Resultados.CANTIDAD_NO_VALIDA;
        }
        if (otro == null|| otro == this ){
            return Resultados.DESTINATARIO_NO_VALIDO;
        }
        if(this.saldo<euros){
            return Resultados.SALDO_INSUFICIENTE;
            }

            this.saldo-=euros;
            otro.entradaDinero(euros);
            return Resultados.CORRECTA;


    }



}




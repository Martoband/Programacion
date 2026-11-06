import utils.FrutaException;

public class Fruta {
    private String tipo;
    private String color;
    private int cantidad;
    public Fruta(){}
    public Fruta (String tipo, String color, int cantidad)throws FrutaException {
        if(tipo.equals("uva")){
            throw new FrutaException("Me da alergia, no la quiero");
        }else {
         this.tipo=tipo;
         this.color=color;
         this.cantidad=cantidad;
        }

    }

    public String getTipo() {

        return tipo;
    }

    public void setTipo(String tipo) throws FrutaException {
        if(tipo.equals("uva")){
            throw new FrutaException("Me da alergia, no la quiero");
        }else {
        this.tipo = tipo;
    }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fruta (String tipo, String color)throws FrutaException{
        if(tipo.equals("uva")){
            throw new FrutaException("Me da alergia, no la quiero");
        }else {
            this.tipo=tipo;
            this.color=color;
        cantidad=0;
    }



}

}

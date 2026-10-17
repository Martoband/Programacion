package model;

import java.util.Locale;

public class Libro {
public String titulo;
public String autor;
public int paginas;

    public Libro (){
    this.titulo="Sin titulo";
    this.autor="Autor desconocido";
    this.paginas=0;
    }
    public Libro(String titulo, String autor, int paginas){
        this.titulo=titulo;
        this.autor=autor;
        this.paginas=paginas;
    }
    public void informacion(){
        System.out.printf("Título: %s\nAutor: %s\nPáginas: %d\n\n",titulo, autor, paginas);
    }
}

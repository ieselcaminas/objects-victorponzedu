package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private int co_aut;
    private String nombre;
    private List<Libro> libros = new ArrayList<>();
    public Autor(int co_aut, String nombre) {
        this.co_aut = co_aut;
        this.nombre = nombre;
    }

    public int getCo_aut() {
        return co_aut;
    }

    public void setCo_aut(int co_aut) {
        this.co_aut = co_aut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }
    public void addLibro(Libro libro){
        this.libros.add(libro);
    }
    @Override
    public String toString(){
        return this.nombre;
    }
}

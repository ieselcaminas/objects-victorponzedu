package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Libro> libros = new ArrayList<>();
        Autor q = new Autor("Cervantes", "1671");

        Tema t = new Tema("Caballeros");

        Libro l = new Libro("Quijote", q);
        l.addTema(t);
        t.addLibro(l);

        t = new Tema("Aventuras");
        l.addTema(t);
        t.addLibro(l);
        libros.add(l);

        for(Libro libro: libros){
            System.out.println(libro.getTitulo() + " - " + libro.getAutor());
            for(Tema tema: libro.getTemas()){
                System.out.println("\t" + tema.getNombre());
            }
        }
    }
}

package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Lector {
    private int cod_lec;
    private String nombre;
    private List<Ejemplar> ejemplars = new ArrayList<>();

    public Lector(int cod_lec, String nombre) {
        this.cod_lec = cod_lec;
        this.nombre = nombre;
    }

    public int getCod_lec() {
        return cod_lec;
    }

    public void setCod_lec(int cod_lec) {
        this.cod_lec = cod_lec;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addEjemplar(Ejemplar ejemplar){
        this.ejemplars.add(ejemplar);
    }
    @Override
    public String toString(){
        return this.nombre;
    }
}

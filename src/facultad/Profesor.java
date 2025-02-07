package facultad;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private int n_prof;
    private String nombre;
    private Departamento departamento;
    private List<Catedra> catedras;

    public Profesor(int n_prof, String nombre, Departamento departamento) {
        this.n_prof = n_prof;
        this.nombre = nombre;
        this.departamento = departamento;
        this.catedras = new ArrayList<>();
    }

    public int getN_prof() {
        return n_prof;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<Catedra> getCatedras() {
        return catedras;
    }
    public void addCatedra(Catedra catedra){
        this.catedras.add(catedra);
    }

    @Override
    public String toString(){
        return this.nombre;
    }
}

package facultad;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private int n_dep;
    private String nombre;
    private AreaConocimiento ac;
    private List<Profesor> profesores = new ArrayList<>();
    private Catedra catedra;

    public Departamento(int n_dep, String nombre, AreaConocimiento ac, Catedra catedra) {
        this.n_dep = n_dep;
        this.nombre = nombre;
        this.ac = ac;
        this.catedra = catedra;
    }

    public int getN_dep() {
        return n_dep;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public AreaConocimiento getAc() {
        return ac;
    }

    public void setAc(AreaConocimiento ac) {
        this.ac = ac;
    }

    public void addProfesor(Profesor profesor){
        this.profesores.add(profesor);
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public Catedra getCatedra() {
        return catedra;
    }

    public void setCatedra(Catedra catedra) {
        this.catedra = catedra;
    }

    @Override
    public String toString(){
        return "Dep: " + this.nombre;
    }
}

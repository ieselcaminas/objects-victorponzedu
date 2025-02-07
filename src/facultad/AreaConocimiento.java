package facultad;

import java.util.ArrayList;
import java.util.List;

public class AreaConocimiento {
    private int n_area;
    private String nombre;
    private List<Departamento> departamentos;

    public AreaConocimiento(int n_area, String nombre) {
        this.n_area = n_area;
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
    }



    public int getN_area() {
        return n_area;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addDepartamento(Departamento departamento){
        this.departamentos.add(departamento);
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    @Override
    public String toString() {
        return "Area " + this.nombre;
    }
}

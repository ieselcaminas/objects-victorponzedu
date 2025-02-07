package banco;

import ejercicio4.Libro;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String DNI;
    private String nombre;
    private List<Prestamo> prestamos;
    private List<CC> ccs;

    public Cliente(String DNI, String nombre) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.prestamos = new ArrayList<>();
        this.ccs = new ArrayList<>();
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addPrestamo(Prestamo prestamo){
        this.prestamos.add(prestamo);
    }

    public List<Prestamo> getPrestamos(){
        return this.prestamos;
    }

    public List<CC> getCcs() {
        return ccs;
    }
    public void addCC(CC cc){
        this.ccs.add(cc);
    }

    @Override
    public String toString(){
        return this.DNI + " - " + this.nombre;
    }
}

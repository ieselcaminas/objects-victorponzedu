package banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private int n_ent;
    private String nombre;
    //Como es una lista, el nombre de la variable debe ir en plural
    private List<Sucursal> sucursales;

    public Banco(int n_ent, String nombre) {
        this.n_ent = n_ent;
        this.nombre = nombre;
        //Inicializarla a una lista vacía porque si no se hace dará error al hacer addSucursal
        this.sucursales = new ArrayList<>();
    }

    public int getN_ent() {
        return n_ent;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Añadir la sucursal a la lista.
    // El método no debe llamarse en plural porque SOLO SE AÑADE UNA.
    public void addSucursal(Sucursal sucursal){
        this.sucursales.add(sucursal);
    }

    //Devolver la lista. Como devuelve una lista se debe llamar en plural
    public List<Sucursal> getSucursales() {
        return this.sucursales;
    }

    @Override
    public String toString(){
        return this.n_ent + " - " + this.nombre;
    }
}

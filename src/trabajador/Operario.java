package trabajador;

public abstract class Operario extends Empleado {
    public Operario(String nombre){
        super(nombre);
    }


    public String toString(){
        return "Operario: " + getNombre();
    }

}

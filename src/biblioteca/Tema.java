package biblioteca;

public class Tema {
    private int co_tem;
    private String nombre;

    public Tema(int co_tem, String nombre) {
        this.co_tem = co_tem;
        this.nombre = nombre;
    }

    public int getCo_tem() {
        return co_tem;
    }

    public void setCo_tem(int co_tem) {
        this.co_tem = co_tem;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return this.nombre;
    }
}

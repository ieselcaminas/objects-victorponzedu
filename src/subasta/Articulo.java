package subasta;

public class Articulo {
    private int n_art;
    private String nombre;
    private double precio;
    private Lote lote;

    public Articulo(int n_art, String nombre, double precio, Lote lote) {
        this.n_art = n_art;
        this.nombre = nombre;
        this.precio = precio;
        this.lote = lote;
    }

    public int getN_art() {
        return n_art;
    }

    public void setN_art(int n_art) {
        this.n_art = n_art;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    @Override
    public String toString(){
        return this.n_art + " - " + this.nombre + " - " + this.precio;
    }
}

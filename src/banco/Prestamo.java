package banco;

public class Prestamo {
    private int n_pres;
    private int cantidad;
    private Cliente cliente;
    private Sucursal sucursal;
    public Prestamo(int n_pres, int cantidad, Cliente cliente, Sucursal sucursal) {
        this.n_pres = n_pres;
        this.cantidad = cantidad;
        this.cliente = cliente;
        this.sucursal = sucursal;
    }

    public int getN_pres() {
        return n_pres;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    @Override
    public String toString(){
        return this.n_pres + " - " + this.cantidad;
    }
}

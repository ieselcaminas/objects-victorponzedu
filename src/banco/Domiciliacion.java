package banco;

import java.util.ArrayList;
import java.util.List;

public class Domiciliacion {
    private int n_dom;
    private String concepto;
    private double cantidad;
    private List<Cliente> clientes = new ArrayList<>();

    public Domiciliacion(int n_dom, String concepto, double cantidad) {
        this.n_dom = n_dom;
        this.concepto = concepto;
        this.cantidad = cantidad;
    }

    public int getN_dom() {
        return n_dom;
    }

    public void setN_dom(int n_dom) {
        this.n_dom = n_dom;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
    }
    @Override
    public String toString(){
        return n_dom + " - " + this.concepto + " - " + this.cantidad;
    }
}

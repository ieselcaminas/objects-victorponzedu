package banco;

import java.util.ArrayList;
import java.util.List;

public class CC {
    private int n_cc;
    private List<Cliente> clientes;
    private List<Domiciliacion> domiciliaciones;

    public CC(int n_cc){
        this.n_cc = n_cc;
        this.clientes = new ArrayList<>();
        this.domiciliaciones = new ArrayList<>();
    }

    public int getN_cc() {
        return n_cc;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void addCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public List<Domiciliacion> getDomiciliaciones() {
        return domiciliaciones;
    }

    public void addDomiciliacion (Domiciliacion dom){
        this.domiciliaciones.add(dom);
    }

    @Override
    public String toString(){
        return "CC: " + n_cc;
    }
}

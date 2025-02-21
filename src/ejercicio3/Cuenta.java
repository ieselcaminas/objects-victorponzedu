package ejercicio3;

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidad = 0;
    }

    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void ingresar(double ingreso){
        if (ingreso > 0){
            this.cantidad += ingreso;
        }
    }
    public void retirar(double retirar){
        if (this.cantidad - retirar > 0){
            this.cantidad -= retirar;
        }
    }
}

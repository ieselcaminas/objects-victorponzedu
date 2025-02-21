package ejercicio3;

public class Main {
    public static void main(String[] args) {
        Cuenta c = new Cuenta("Víctor");
        Cuenta c2 = new Cuenta("Víctor", 1000);
        c2.retirar(1100);
        System.out.println(c2.getCantidad());

    }
}

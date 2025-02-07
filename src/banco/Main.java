package banco;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Banco> bancos = new ArrayList<>();
        Banco bbva = new Banco(1, "BBVA");
        bancos.add(bbva);
            Sucursal sucursalBbva1 = new Sucursal(1, "Castellón", bbva);
            bbva.addSucursal(sucursalBbva1);
                Cliente victor = new Cliente("124434", "Víctor");
                Prestamo pVictor = new Prestamo(1, 100, victor, sucursalBbva1);
                    victor.addPrestamo(pVictor);

                sucursalBbva1.addPrestamo(pVictor);

            Sucursal sucursalBbva2 = new Sucursal(2, "Valencia", bbva);
            bbva.addSucursal(sucursalBbva2);



        Banco santander = new Banco(2, "Santander");
        bancos.add(santander);
            Sucursal sucursalSant = new Sucursal(1, "Vilareal", santander);
            santander.getSucursales().add(sucursalSant);

        for(Banco b: bancos){
            System.out.println(b);
            for(Sucursal s: b.getSucursales()){
                System.out.println("\t" + s);
            }
        }

    }
}

package subasta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Subasta sub = new Subasta(1, "Subasta día 10");
        Subasta sub2 = new Subasta(2, "Subasta día 2");

        List<Subasta> casaDeSubastas = new ArrayList<>();

        casaDeSubastas.add(sub);
        casaDeSubastas.add(sub2);

        Lote lote1 = new Lote(1, "Lote 1", sub);

        sub.addLote(lote1);

        Articulo libro = new Articulo(1, "libro", 100, lote1);
        Articulo ipad = new Articulo(2, "ipad", 1000, lote1);

        lote1.addArticulo(libro);
        lote1.addArticulo(ipad);

        Lote lote2 = new Lote(2, "Lote 2", sub);
        sub.addLote(lote2);
        Articulo gafas = new Articulo(3, "Gafas" , 100, lote2);
        lote2.addArticulo(gafas);

        Pujador pepe = new Pujador(1, "Pepe");
        Pujador maria = new Pujador(2, "María");

        Puja puja = new Puja(1, 100, pepe, lote1);
        pepe.addPuja(puja);
        lote1.addPuja(puja);


    }
}

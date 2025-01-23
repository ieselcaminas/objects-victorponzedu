package herencia;
public class Perro extends Mamifero{

    Perro(String nombre){
        super(nombre);
    }

    public void traerZapatillas(){
        System.out.println("Toma amo tus zapatillas");
    }

    /**
     * El perro se comunica de forma distinta a Animal y, por eso, se sobrescribe
     */
    @Override
    public void comunicarse()
    {

        System.out.println("guau");

    }
}

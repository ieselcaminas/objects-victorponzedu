package herencia;
public class PezPayaso extends Pez{
    public PezPayaso(String nombre){
        super(nombre);
    }

    /**
     * El método comunicarse es particular para el pez payaso
     */
    @Override
    public void comunicarse()
    {
        System.out.println("Me comunico haciendo burbujas");
    }

}

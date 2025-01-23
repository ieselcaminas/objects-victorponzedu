package herencia;
public abstract class Pez extends Animal {
    public Pez(String nombre) {
        super(nombre);
    }
    @Override
    public void respirar()
    {
        System.out.println("Respiro con branquias");
    }

    @Override
    public void moverse(){
        System.out.println("Me muevo nadando");
    }
}

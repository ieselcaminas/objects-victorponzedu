package herencia;
public class Gato extends Mamifero implements Jugar{
    public Gato(String nombre){
        super(nombre);
    }
    public void perseguirUnOvillo(){
        System.out.println("Perseguir Un Ovillo");
    }
    @Override
    public void comunicarse()
    {
        System.out.println("Miau");

    }
    @Override
    public void saltarPorUnAro(){
        System.out.println("Sé saltar por aro");
    }

    @Override
    public void perseguirUnObjeto(){
        System.out.println("Sé perseguir una objeto");
    }
}

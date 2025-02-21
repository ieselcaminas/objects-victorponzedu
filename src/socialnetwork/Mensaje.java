package socialnetwork;

public class Mensaje extends Publicacion{
    private int id;
    private String texto;

    public Mensaje(Usuario usuario, int id, String texto){
        //Siempre hemos de llamar a un constructor de la clase padre
        super(usuario);
        this.id = id;
        this.texto = texto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString(){
        return  "ID - " + this.id + " usuario: " + this.getUsuario().getNombre() + " - " + this.texto;
    }
}

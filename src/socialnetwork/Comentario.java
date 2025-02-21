package socialnetwork;

public class Comentario {
    private int id;
    private Usuario usuario;
    private String texto;
    private Publicacion publicacion;

    public Comentario(int id, Usuario usuario, String texto, Publicacion publicacion) {
        this.id = id;
        this.usuario = usuario;
        this.texto = texto;
        this.publicacion = publicacion;
    }

    public int getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }


    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    @Override
    public String toString(){
        return "id - " + this.id + "Usuario - " + this.usuario.getNombre() + " texto: " + this.texto;
    }
}

package socialnetwork;

import java.util.ArrayList;
import java.util.List;

public class Usuario{
    private String nick;
    private String nombre;
    private int id;
    private List<Publicacion> publicaciones = new ArrayList<>();
    public Usuario(String nick, String nombre, int id) {
        this.nick = nick;
        this.nombre = nombre;
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void addPubicacion(Publicacion publicacion){
        this.publicaciones.add(publicacion);
    }
    @Override
    public String toString(){
        return this.id + " - " + this.nick;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Usuario other = (Usuario) obj;
        if (this.nick == null) {
            return other.nick == null;
        } else return nick.equals(other.nick);
    }
}

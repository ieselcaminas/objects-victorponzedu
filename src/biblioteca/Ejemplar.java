package biblioteca;

public class Ejemplar {
    private int cod_eje;
    private Libro libro;

    public Ejemplar(int cod_eje, Libro libro) {
        this.cod_eje = cod_eje;
        this.libro = libro;
    }

    public int getCod_eje() {
        return cod_eje;
    }

    public void setCod_eje(int cod_eje) {
        this.cod_eje = cod_eje;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
}

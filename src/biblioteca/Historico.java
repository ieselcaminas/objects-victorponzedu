package biblioteca;

public class Historico {
    private int cod_hist;
    private Lector lector;
    private Ejemplar ejemplar;
    private String fecha_p;
    private String fecha_dev;

    public Historico(int cod_hist, Lector lector, Ejemplar ejemplar, String fecha_p, String fecha_dev) {
        this.cod_hist = cod_hist;
        this.lector = lector;
        this.ejemplar = ejemplar;
        this.fecha_p = fecha_p;
        this.fecha_dev = fecha_dev;
    }

    public int getCod_hist() {
        return cod_hist;
    }

    public Lector getLector() {
        return lector;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }
}

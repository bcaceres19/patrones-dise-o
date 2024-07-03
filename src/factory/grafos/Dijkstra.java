package factory.grafos;

public class Dijkstra {

    private int cantidad;

    private String recorrido;

    private int inicio;

    private int fin;

    public Dijkstra(int cantidad, String recorrido, int inicio, int fin) {
        this.cantidad = cantidad;
        this.recorrido = recorrido;
        this.inicio = inicio;
        this.fin = fin;
    }

    @Override
    public String toString() {
        return "minimo: "+this.cantidad+" Recorrido: "+this.inicio+" "+this.recorrido+""+this.fin;
    }


    public Dijkstra() {
    }

    public int getCantidad() {
        return cantidad;
    }

    public Dijkstra setCantidad(int cantidad) {
        this.cantidad = cantidad;
        return this;
    }

    public String getRecorrido() {
        return recorrido;
    }

    public Dijkstra setRecorrido(String recorrido) {
        this.recorrido = recorrido;
        return this;
    }

    public int getInicio() {
        return inicio;
    }

    public Dijkstra setInicio(int inicio) {
        this.inicio = inicio;
        return this;
    }

    public int getFin() {
        return fin;
    }

    public Dijkstra setFin(int fin) {
        this.fin = fin;
        return this;
    }
}

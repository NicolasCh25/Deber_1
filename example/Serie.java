public class Serie {
    private String nombre;
    private int temporadas;

    public Serie(String nombre, int temporadas) {
        this.nombre = nombre;
        this.temporadas = temporadas;
    }

    public void imprimirDetalle() {
        System.out.println("Serie: " + nombre + " con " + temporadas + " temporadas");
    }
}

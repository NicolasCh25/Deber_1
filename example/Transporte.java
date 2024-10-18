public class Transporte {
    private String tipo;
    private int capacidad;

    public Transporte(String tipo, int capacidad) {
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public void imprimirDetalle() {
        System.out.println("Transporte: " + tipo + " con capacidad de " + capacidad + " personas");
    }
}

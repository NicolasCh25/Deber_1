public class Materia {
    private String nombre;
    private int creditos;

    public Materia(String nombre, int creditos) {
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public void imprimirDetalle() {
        System.out.println("Materia: " + nombre + " con " + creditos + " créditos");
    }
}

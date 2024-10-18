public class InstrumentoMusical {
    private String nombre;
    private String tipo;

    public InstrumentoMusical(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void imprimirDetalle() {
        System.out.println("Instrumento Musical: " + nombre + " de tipo " + tipo);
    }
}

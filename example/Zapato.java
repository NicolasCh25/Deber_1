public class Zapato {
    private String marca;
    private int talla;

    public Zapato(String marca, int talla) {
        this.marca = marca;
        this.talla = talla;
    }

    public void imprimirDetalle() {
        System.out.println("Zapato: Marca " + marca + ", Talla " + talla);
    }
}

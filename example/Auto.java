public class Auto {
    private String marca;
    private String modelo;

    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void imprimirDetalle() {
        System.out.println("Auto: " + marca + " " + modelo);
    }
}

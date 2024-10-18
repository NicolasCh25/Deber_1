public class Cancion {
    private String nombreDelArtista;
    private String genero;

    public Cancion(String nombreDelArtista, String genero) {
        this.nombreDelArtista = nombreDelArtista;
        this.genero = genero;
    }

    public void imprimirDetalle() {
        System.out.println("Canción de: " + nombreDelArtista + " Género: " + genero);
    }
}

public class Videojuego {
    private String titulo;
    private String plataforma;

    public Videojuego(String titulo, String plataforma) {
        this.titulo = titulo;
        this.plataforma = plataforma;
    }

    public void imprimirDetalle() {
        System.out.println("Videojuego: " + titulo + " en plataforma: " + plataforma);
    }
}

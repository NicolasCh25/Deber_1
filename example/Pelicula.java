public class Pelicula {
    private String titulo;
    private String director;

    public Pelicula(String titulo, String director) {
        this.titulo = titulo;
        this.director = director;
    }

    public void imprimirDetalle() {
        System.out.println("Película: " + titulo + " dirigida por " + director);
    }
}

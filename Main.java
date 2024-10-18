
public class Main {
    public static void main(String[] args) {
        // Canciones
        Cancion cancion1 = new Cancion("Queen", "Rock");
        Cancion cancion2 = new Cancion("John Lennon", "Pop");
        cancion1.imprimirDetalle();
        cancion2.imprimirDetalle();

        // Series
        Serie serie1 = new Serie("Breaking Bad", 5);
        Serie serie2 = new Serie("Friends", 10);
        serie1.imprimirDetalle();
        serie2.imprimirDetalle();

        // Videojuegos
        Videojuego videojuego1 = new Videojuego("The Legend of Zelda", "Nintendo");
        Videojuego videojuego2 = new Videojuego("Minecraft", "PC");
        videojuego1.imprimirDetalle();
        videojuego2.imprimirDetalle();

        // Personas
        Persona persona1 = new Persona("Juan", 25);
        Persona persona2 = new Persona("Maria", 30);
        persona1.imprimirDetalle();
        persona2.imprimirDetalle();

        // Autos
        Auto auto1 = new Auto("Toyota", "Corolla");
        Auto auto2 = new Auto("Ford", "Mustang");
        auto1.imprimirDetalle();
        auto2.imprimirDetalle();

        // Transportes
        Transporte transporte1 = new Transporte("Autobús", 50);
        Transporte transporte2 = new Transporte("Avión", 300);
        transporte1.imprimirDetalle();
        transporte2.imprimirDetalle();

        // Materias
        Materia materia1 = new Materia("Matemáticas", 5);
        Materia materia2 = new Materia("Programación", 4);
        materia1.imprimirDetalle();
        materia2.imprimirDetalle();

        // Zapatos
        Zapato zapato1 = new Zapato("Nike", 42);
        Zapato zapato2 = new Zapato("Adidas", 40);
        zapato1.imprimirDetalle();
        zapato2.imprimirDetalle();

        // Instrumentos Musicales
        InstrumentoMusical instrumento1 = new InstrumentoMusical("Guitarra", "Cuerda");
        InstrumentoMusical instrumento2 = new InstrumentoMusical("Piano", "Teclas");
        instrumento1.imprimirDetalle();
        instrumento2.imprimirDetalle();

        // Películas
        Pelicula pelicula1 = new Pelicula("Inception", "Christopher Nolan");
        Pelicula pelicula2 = new Pelicula("The Matrix", "The Wachowskis");
        pelicula1.imprimirDetalle();
        pelicula2.imprimirDetalle();
    }
}

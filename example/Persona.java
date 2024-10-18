public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void imprimirDetalle() {
        System.out.println("Persona: " + nombre + ", Edad: " + edad + " años");
    }
}

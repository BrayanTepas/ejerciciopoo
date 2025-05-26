package src;

public abstract class Persona {
    private Integer id;
    private String nombre;
    private String apellidos;
    private Integer edad;
    
    public Persona() {
    }

    public Persona(Integer id, String nombre, String apellidos, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public abstract void concentrarse();

    public abstract void viajar();

}

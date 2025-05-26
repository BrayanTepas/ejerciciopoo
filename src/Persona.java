package src;
//aqui se hizo la abstraccion de la clase Persona, que es la clase padre de Futbolista, Masajista y Entrenador
//la herencia se da de la clase Persona a las clases Futbolista, Masajista y Entrenador
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public abstract void concentrarse();

    public abstract void viajar();

}

package src;
//se hizo polimorfismo con @override en los metodos concentrarse y viajar
//se hizo herencia de la clase Persona a la clase Futbolista
//se hizo encapsulamiento con los atributos de la clase Futbolista
//la abstraccion se cumple con modificar los metodos abstractos concentrarse y viajar que se encuentran en la clase Persona

public class Masajista extends Persona {
    private String titulacion;
    private Integer aniosExperiencia;

    public Masajista() {
    }

    public Masajista(String titulacion, Integer aniosExperiencia) {
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public Masajista(Integer id, String nombre, String apellidos, Integer edad, String titulacion,
            Integer aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public Integer getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(Integer aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public void concentrarse() {
        System.out.println("El masajista se concentra.");
    }
    
    @Override
    public void viajar() {
        System.out.println("El masajista viaja con el equipo.");
    }

    public void darMasaje() {
        System.out.println("El masajista da un masaje.");
    }

}

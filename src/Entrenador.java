package src;
//se hizo polimorfismo con @override en los metodos concentrarse y viajar
//se hizo herencia de la clase Persona a la clase Futbolista
//se hizo encapsulamiento con los atributos de la clase Futbolista
//la abstraccion se cumple con modificar los metodos abstractos concentrarse y viajar que se encuentran en la clase Persona

public class Entrenador extends Persona {
    private String idFederacion;

    public Entrenador() {
    }

    public Entrenador(Integer id, String nombre, String apellidos, Integer edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public void concentrarse() {
        System.out.println("El entrenador se concentra.");
    }
    @Override
    public void viajar() {
        System.out.println("El entrenador viaja con el equipo.");
    }

    public void dirigirPartido() {
        System.out.println("El entrenador dirige un partido.");
    }
    public void dirigirEntrenamiento() {
        System.out.println("El entrenador dirige un entrenamiento.");
    }

}

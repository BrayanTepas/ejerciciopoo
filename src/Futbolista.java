package src;

public class Futbolista extends Persona {
    private Integer dorsal;
    private String demarcacion;

    public Futbolista() {
    }

    public Futbolista(Integer dorsal, String demarcacion) {
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public Futbolista(Integer id, String nombre, String apellidos, Integer edad, Integer dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    // Getters and Setters
    public Integer getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public void concentrarse() {
        System.out.println("El futbolista se concentra.");
    }
    @Override
    public void viajar() {
        System.out.println("El futbolista viaja con el equipo.");
    }
    
    public void jugarPartido() {
        System.out.println("El futbolista juega un partido.");
    }
    public void entrenar() {
        System.out.println("El futbolista entrena.");
    }
}

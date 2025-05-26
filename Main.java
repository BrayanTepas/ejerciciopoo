import src.Futbolista;
import src.Masajista;
import src.Entrenador;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Futbolista, Masajista y Entrenador
        Futbolista futbolista = new Futbolista(10, "Delantero");
        
        Masajista masajista = new Masajista("Fisioterapia", 10);
        
        Entrenador entrenador = new Entrenador(3, "Pep", "Guardiola", 50, "12345");
        
        // Llamar a los métodos de cada clase
        futbolista.concentrarse();
        futbolista.viajar();
        futbolista.jugarPartido();
        
        System.out.println();
        masajista.concentrarse();
        masajista.viajar();
        masajista.darMasaje();
        
        System.out.println();
        entrenador.concentrarse();
        entrenador.viajar();
        entrenador.dirigirPartido();
    }
}

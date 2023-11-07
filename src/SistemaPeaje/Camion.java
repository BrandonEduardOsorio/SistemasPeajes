package SistemaPeaje;

public class Camion extends Vehiculo {
    private int numeroEjes; // Asegúrate de tener un atributo "numeroEjes" en la clase Camion.

    public Camion(String placa, int numeroEjes, double tarifaPeaje) {
        super("Camion", placa, tarifaPeaje); // Llama al constructor de la clase base con "Camion" y la tarifa de peaje proporcionada.
        this.numeroEjes = numeroEjes;
    }

}

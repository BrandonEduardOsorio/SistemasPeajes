package SistemaPeaje;

public class Moto extends Vehiculo {
    public Moto(String placa, double tarifaPeaje) {
        super("Moto", placa, tarifaPeaje);
    }

    @Override
    public double calcularPeajes() {
    // Implementa la lógica para calcular los peajes de una moto aquí.
    // Puedes usar getTarifaPeaje() para obtener la tarifa específica de la moto.
    return getTarifaPeaje();
}

    }
package SistemaPeaje;

public class Vehiculo {
    private String tipo;
    private String placa;
    private double tarifaPeaje;

    public Vehiculo(String tipo, String placa, double tarifaPeaje) {
        this.tipo = tipo;
        this.placa = placa;
        this.tarifaPeaje = tarifaPeaje;
    }
    public double getTarifaPeaje() {
        return tarifaPeaje;
    }
    public String getPlaca() {
    return placa;
  
}
public double calcularPeajes() {
    // Implementa la lógica para calcular los peajes de un vehículo aquí.
    return 0.0; // Reemplaza con la lógica real.
}


}

   



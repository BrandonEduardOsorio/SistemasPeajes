package SistemaPeaje;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private String apellidos;
    private String numeroDocumento;
    private String fechaNacimiento;
    private List<Vehiculo> vehiculosAsignados;

    public Persona(String nombre, String apellidos, String numeroDocumento, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDocumento = numeroDocumento;
        this.fechaNacimiento = fechaNacimiento;
        this.vehiculosAsignados = new ArrayList<>();
    }

    public void asignarVehiculo(Vehiculo vehiculo) {
        vehiculosAsignados.add(vehiculo);
    }

    public void desasignarVehiculo(Vehiculo vehiculo) {
        vehiculosAsignados.remove(vehiculo);
    }

    public double calcularTotalPeajes() {
        double totalPeajes = 0;
        for (Vehiculo vehiculo : vehiculosAsignados) {
            totalPeajes += vehiculo.getTarifaPeaje();
        }
        return totalPeajes;
    }
}

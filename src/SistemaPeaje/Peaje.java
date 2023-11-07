package SistemaPeaje;

import java.util.*;

public class Peaje {
    String nombre;
    String departamento;
    Vector vehiculos;
    int totalPeaje = 0;
    static int totalCamiones = 0;
    static int totalMotos = 0;
    static int totalCarros = 0;

    Peaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        vehiculos = new Vector();
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    private void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void addVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

public void calcularPeaje(Vehiculo vehiculo) {
    totalPeaje += vehiculo.calcularPeajes(); // Suma el peaje calculado al totalPeaje
}


    public void imprimir() {
        System.out.println("Peaje = " + getNombre());
        System.out.println("Ubicación = " + getDepartamento());
        System.out.println("Total de carros = " + totalCarros);
        System.out.println("Total de motos = " + totalMotos);
        System.out.println("Total de camiones = " + totalCamiones);

        int totalVehiculos = totalCarros + totalMotos + totalCamiones;
        System.out.println("Total de vehículos = " + totalVehiculos);
        System.out.println("Dinero total = $" + totalPeaje);
    }
}

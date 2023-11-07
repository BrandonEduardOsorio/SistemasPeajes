package SistemaPeaje;

public class Prueba {
    public static void main(String[] args) {
        // Crear una instancia de Persona
        Persona persona = new Persona("Nombre", "Apellidos", "Documento", "Fecha");

        // Crear instancias de vehículos
        Carro carro1 = new Carro("ABC-123");
        Moto moto1 = new Moto("XYZ-789", 5000.0);

        // Asignar vehículos a la persona
        persona.asignarVehiculo(carro1);
        persona.asignarVehiculo(moto1);

        // Desasignar un vehículo
        persona.desasignarVehiculo(carro1);
        persona.desasignarVehiculo(moto1);

        // Intentar desasignar un vehículo que no está asignado
        // Crea una instancia de Camion con los tres argumentos requeridos (placa, número de ejes y tarifa de peaje).
        Camion camion1 = new Camion("PKI-889", 2, 15000.0);
        persona.desasignarVehiculo(camion1); // Esto mostrará un mensaje que indica que el vehículo no está asignado
    }
}

package SistemaPeajeTest;

import SistemaPeaje.Persona;
import SistemaPeaje.Vehiculo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PersonaTest {
    @Test
    void testAsignarYDesasignarVehiculo() {
        Persona persona = new Persona("Nombre", "Apellidos", "Documento", "Fecha");
        Vehiculo vehiculo1 = new Vehiculo("Carro", "PKI-889", 10000);
        Vehiculo vehiculo2 = new Vehiculo("Moto", "ABC-123", 5000);

        persona.asignarVehiculo(vehiculo1);
        persona.asignarVehiculo(vehiculo2);

        assertEquals(2, persona.getVehiculosAsignados().size());

        persona.desasignarVehiculo(vehiculo1);

        assertEquals(1, persona.getVehiculosAsignados().size());
    }

    @Test
    void testCalcularTotalPeajes() {
        Persona persona = new Persona("Nombre", "Apellidos", "Documento", "Fecha");
        Vehiculo vehiculo1 = new Vehiculo("Carro", "PKI-889", 10000);
        Vehiculo vehiculo2 = new Vehiculo("Moto", "ABC-123", 5000);

        persona.asignarVehiculo(vehiculo1);
        persona.asignarVehiculo(vehiculo2);

        double totalPeajes = persona.calcularTotalPeajes();

        assertEquals(15000, totalPeajes);
    }
}

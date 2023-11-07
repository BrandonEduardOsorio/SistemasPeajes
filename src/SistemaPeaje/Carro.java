package SistemaPeaje;

public class Carro extends Vehiculo {
    // Atributo estático que identifica el valor de peaje a pagar por un carro
    public static int valorPeaje = 10000;

    /**
    * Constructor de la clase Carro
    * @param placa Parámetro que define la placa de un carro
    */
    Carro(String placa) {
        super("Carro", placa, valorPeaje); // Llama al constructor de la clase padre con los valores adecuados
    }

    /**
    * Método que devuelve el valor del peaje para un carro
    * @return El valor del peaje para un carro
    */
    public int getValorPeaje() {
        return valorPeaje;
    }

    /**
    * Método que establece el valor del peaje para un carro
    * @param Parámetro que define el valor del peaje para un carro
    */
    static void setValorPeaje(int valorPeaje) {
        valorPeaje = valorPeaje;
    }

    /**
    * Método que muestra en pantalla la placa y el valor del peaje de un
    * carro
    */
    void imprimir() {
        System.out.println("Placa = " + getPlaca());
        System.out.println("Valor del peaje = " + valorPeaje);
    }
}

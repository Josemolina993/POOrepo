package Inmuebles;

public class Inmueble_vivienda extends Inmueble {

    protected int numeroHabitaciones;
    protected int numeroBaños;

    // Constructor
    public Inmueble_vivienda(int identificadorInmobiliario, int area, String direccion, int numeroBaños, int numeroHabitaciones) {

        // Llama al constructor de la superclase
        super(identificadorInmobiliario, area, direccion);
        
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBaños = numeroBaños;
    }

    // Método que muestra en pantalla los datos

    @Override
    public void imprimir() {

        super.imprimir(); // Llama al método imprimir de la superclase

        System.out.println("Número de habitaciones = " + numeroHabitaciones);
        System.out.println("Número de baños = " + numeroBaños);
    }
}

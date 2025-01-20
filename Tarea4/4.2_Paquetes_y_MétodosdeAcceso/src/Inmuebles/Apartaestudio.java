package Inmuebles;

public class Apartaestudio extends Apartamento {

    protected static double valorArea = 1500000;

    //Constructor

    public Apartaestudio(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {

        super(identificadorInmobiliario, area, direccion, 1, 1);
    }
    
    //Metodo imprimir en pantalla los datos
    @Override
    public void imprimir() {

        super.imprimir();
        System.out.println();
    }
}

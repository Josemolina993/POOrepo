package Inmuebles;

public class CasaIndependiente extends CasaUrbana {

    protected static double valorArea = 3000000;

    //Constructor

    public CasaIndependiente(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños, int numeroPisos) {

        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
    }

    //Metodo para imprimir en pantalla los datos
    @Override
    public void imprimir() {

        super.imprimir();
        System.out.println();
    }
    
}

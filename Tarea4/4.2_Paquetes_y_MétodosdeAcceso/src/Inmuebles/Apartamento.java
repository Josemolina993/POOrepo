package Inmuebles;

public class Apartamento extends Inmueble_vivienda {

    //Contructor

    public Apartamento(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {

        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
    }

    //Metodo para imprimir en pantalla

    @Override

    public void imprimir() { 

        super.imprimir();
        
    }
    
}

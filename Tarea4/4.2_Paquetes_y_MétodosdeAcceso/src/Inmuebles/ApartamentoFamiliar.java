package Inmuebles;

public class ApartamentoFamiliar extends Apartamento {

    protected static double valorArea = 2000000;
    protected int valorAdminsitracion;

    //Constructor

    public ApartamentoFamiliar(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños, int valorAdminsitracion) {

        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
         this.valorAdminsitracion = valorAdminsitracion;
    }

    //Metodo imprimri en pantall datos
    @Override
    public void imprimir() {

        super.imprimir();
        System.out.println("Valor de la administración = $" + valorAdminsitracion);
        System.out.println();
    }
    
}

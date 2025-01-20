package Inmuebles;

public class CasaConjuntoCerrado extends CasaUrbana {

    protected static double valorArea = 2500000;
    protected int valorAdminsitracion;
    protected boolean tienePiscina;
    protected boolean tieneCamposDeportivos;

    //Constructor

    public CasaConjuntoCerrado(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños, int numeroPisos, int valorAdminsitracion, boolean tienePiscina, boolean tieneCamposDeportivos) {

        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);

        this.valorAdminsitracion = valorAdminsitracion;
        this.tienePiscina = tienePiscina;
        this.tieneCamposDeportivos = tieneCamposDeportivos;
    }

    //Metodo para imprimir en pantalla los datos
    @Override
    public void imprimir() {

        super.imprimir();
        System.out.println("Valor de la administración = $" + valorAdminsitracion);
        System.out.println("Tiene piscina? =" + tienePiscina);
        System.out.println("Tiene campos deportivos? = $" + tieneCamposDeportivos);
        System.out.println();
    }
    
}

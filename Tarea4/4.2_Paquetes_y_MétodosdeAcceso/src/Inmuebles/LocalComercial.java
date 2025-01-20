package Inmuebles;

public class LocalComercial extends Local {

    protected static double valorArea = 3000000;
    protected String centroComercial;

    //Constructor
    public LocalComercial(int identificadorInmobiliario, int area, String direccion, tipo tipoLocal, String centroComercial) {

        super(identificadorInmobiliario, area, direccion, tipoLocal);

        this.centroComercial = centroComercial;
    }

    //Metodo para imprimir en pantalla los datos
    @Override
    public void imprimir() {
        
        super.imprimir();
        System.out.println("Centro Comercial = "+ centroComercial);
        System.out.println();
    }
    
}

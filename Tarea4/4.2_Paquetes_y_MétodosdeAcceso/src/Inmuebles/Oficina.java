package Inmuebles;

public class Oficina extends Local {

    protected static double valorArea = 3500000;
    protected boolean esGobierno;

    //Constructor

    public Oficina(int identificadorInmobiliario, int area, String direccion, tipo tipoLocal, boolean esGobierno){

        super(identificadorInmobiliario, area, null, tipoLocal);

        this.esGobierno = esGobierno;
    }

    //Metodo para imprimir en pantalla los datos
    @Override
    public void imprimir() {

        super.imprimir();
        System.out.println("Es oficina gubernamental = "+ esGobierno);
        System.out.println();
    }
    
}

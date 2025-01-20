package Inmuebles;

//public enum tipo {INTERNO, CALLE};

public class Local extends Inmueble {

    

    protected tipo tipoLocal;

    //Cosntructor

    public Local(int identificadorInmobiliario, int area, String direccion, tipo tipoLocal) {

        super(identificadorInmobiliario, area, direccion);

        this.tipoLocal = tipoLocal;
    }
    
    //Metodo para imprimir en pantalla los datos
    @Override
    public void imprimir() {

        super.imprimir();
        System.out.println("Tipo de local = "+ tipoLocal);
    }
}

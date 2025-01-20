package Inmuebles;

public class Inmueble {

    protected int identificadorInmobiliario;
    protected int area;
    protected String direccion;
    protected double precioventa;

    //Constructor
    public Inmueble(int identificadorInmobiliario, int area, String direccion) {

        this.identificadorInmobiliario = identificadorInmobiliario;
        this.area = area;
        this.direccion = direccion;
    }

    //Metodo para calcular el precio
    public double calcularPrecioVenta(double valorArea) {

        precioventa = area * valorArea;
        return precioventa;
    }

    //Metodo que muestra en pantalla los datos
    public void imprimir() {

        System.out.println("Identificador inmobiliario = " + identificadorInmobiliario);
        System.out.println("Área = " + area);
        System.out.println("Dirección = " + direccion);
        System.out.println("Precio de venta = $" + precioventa);
    }
}

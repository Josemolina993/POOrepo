package Inmuebles;

public class principal {
    public static void main(String[] args) {
        Inmueble inmueble = new Inmueble(1, 100, "Calle 123");
        inmueble.imprimir();

        Inmueble vivienda = new Inmueble_vivienda(2, 156, "Calle 457",5, 2);
        vivienda.imprimir();


    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4aejercicio1;
import java.util.Scanner;
/**
 *
 * @author david
 */
public class A4Ejercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cuenta de ahorros");
        System.out.println("Ingrese saldo inicial= $");
        float SaldoInicialAhorros = input.nextFloat();
        System.out.println("Ingrese tasa de interes= ");
        float TasaAhorros = input.nextFloat();
        CuentaAhorros Cuenta1 = new CuentaAhorros(SaldoInicialAhorros, TasaAhorros);
        System.out.println("Ingresar la cantidad a consignar: $");
        float CantidadDepositar = input.nextFloat();
        Cuenta1.Consignar(CantidadDepositar);
        System.out.println("Ingrese cantidad a retirar: $");
        float CantidadRetirar = input.nextFloat();
        Cuenta1.Retirar(CantidadRetirar);
        Cuenta1.ExtractoMensual();
        Cuenta1.imprimir();
        

    }
    
}

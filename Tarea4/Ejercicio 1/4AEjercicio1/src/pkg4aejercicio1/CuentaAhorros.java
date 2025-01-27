/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4aejercicio1;

/**
 *
 * @author david
 */
public class CuentaAhorros extends Cuenta {
    private boolean Activa;
    
    public CuentaAhorros(float Saldo, float Tasa){
        super(Saldo, Tasa);
        if (Saldo<10000){
            Activa = false;
        }
        else{
            Activa = true;
        }
    }
    public void Retirar(float Cantidad){
        if (Activa){
            super.Retirar(Cantidad);
        }
    }
    public void Consignar(float Cantidad){
        if (Activa){
            super.Consignar(Cantidad);
        }
    }public void ExtractoMensual(){
        if (Retiros > 4){
            ComisionMensual += (Retiros - 4)*1000;
        }
        super.ExtractoMensual();
        if (Saldo < 1000){
            Activa = false;
        }
    }
    public void imprimir(){
        System.out.println("Saldo = $" + Saldo);
        System.out.println("Comision mensual = $"+ ComisionMensual);
        System.out.println("Numero de transacciones = "+ (Consignaciones + Retiros));
        System.out.println();
    }
        
}





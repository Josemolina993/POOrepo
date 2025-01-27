/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4aejercicio1;

/**
 *
 * @author david
 */
public class Cuenta {
    protected float Saldo;
    protected int Consignaciones = 0;
    protected int Retiros = 0;
    protected float TasaAnual;
    protected float ComisionMensual = 0;
    
    public Cuenta(float Saldo, float TasaAnual){
        this.Saldo = Saldo;
        this.TasaAnual = TasaAnual;
    }
    
    public void Consignar(float Cantidad){
        Saldo = Saldo + Cantidad;
        Consignaciones = Consignaciones + 1;
    }
    public void Retirar(float Cantidad){
        float NuevoSaldo = Saldo - Cantidad;
        if (NuevoSaldo >= 0){
            Saldo -= Cantidad;
            Retiros = Retiros + 1;
        }
        else{
            System.out.println("La cantidad a retirar excede el saldo actual");
        }
    }
    public void Interes(){
        float TasaMensual = TasaAnual/12;
        float InteresMensual = Saldo*TasaMensual;
        Saldo += InteresMensual;
    }
    public void ExtractoMensual(){
        Saldo -= ComisionMensual;
        Interes();
        
    }
}

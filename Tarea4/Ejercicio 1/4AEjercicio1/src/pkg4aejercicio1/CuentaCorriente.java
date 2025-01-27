/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4aejercicio1;

/**
 *
 * @author david
 */
public class CuentaCorriente extends Cuenta{
    float SobreGiro;
    
    public CuentaCorriente(float Saldo, float Tasa){
        super(Saldo,Tasa);
        SobreGiro = 0;
    }
    public void Retirar(float Cantidad){
        float Resultado = Saldo- Cantidad;
        
        if (Resultado < 0){
            SobreGiro = SobreGiro - Resultado;
            Saldo = 0;
        }
        else {
            super.Retirar(Cantidad);
            
        }
    }
    public void Consignar(float Cantidad){
        float Residuo = SobreGiro - Cantidad;
        
        if (SobreGiro > 0){
            if (Residuo > 0){
                SobreGiro = 0;
                Saldo = Residuo;
            }
            else{
                SobreGiro = -Residuo;
                Saldo = 0;
            }
        }
        else {
            super.Consignar(Cantidad);
        }
    }
    public void ExtractoMensual(){
        super.ExtractoMensual();
    }
    public void imprimir(){
        System.out.println("Saldo = $" + Saldo);
        System.out.println("Cargo mensual = $"+ ComisionMensual);
        System.out.println("Numero de transacciones = "+ (Consignaciones + Retiros));
        System.out.println("Valor de sobregiro = $"+ Consignaciones + Retiros);
        System.out.println();
    
    }
    
}

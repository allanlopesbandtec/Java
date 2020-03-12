/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Saques;

/**
 *
 * @author Aluno
 */
public class ValorSaque {
     Integer saqueValor = 0, nota10 = 0, nota20 = 0, nota50 = 0;   
        
     
    void saque(){
        if (saqueValor % 10 == 0) {
            while (saqueValor > 0) {
                
                if(saqueValor > 50){
                saqueValor -= 50;
                nota50 ++;
                }
            
                else if(saqueValor > 20){
                saqueValor -= 20;
                nota20 ++;
                }
            
                else{
                saqueValor -= 10;
                nota10 ++;
                }
            }
            
            System.out.println("Foi necessário: "  
            + "\n" + nota50 + " notas de 50"  
            + "\n" + nota20 + " notas de 20"  
            + "\n" + nota10 + " notas de 10."  
             );
        }
        
        else{
         System.out.println("Saque indisponível.");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista03;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Saques {
    public static void main(String[] args) {
        Scanner LeitorNum = new Scanner(System.in);
        
        Integer saque = 0, nota10 = 0, nota20 = 0, nota50 = 0;
        
        System.out.println("Digite o valor do saque: ");
        saque = LeitorNum.nextInt();
        
        
        if (saque % 10 == 0) {
            while (saque > 0) {
                
                if(saque > 50){
                saque -= 50;
                nota50 ++;
                }
            
                else if(saque > 20){
                saque -= 20;
                nota20 ++;
                }
            
                else{
                saque -= 10;
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

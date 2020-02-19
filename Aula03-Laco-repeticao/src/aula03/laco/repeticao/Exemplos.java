
package aula03.laco.repeticao;

import java.util.Scanner;


public class Exemplos {
    
    public static void main(String[] args) {
        Integer cont = 1, numero;
        
        Scanner leitor = new Scanner(System.in);
        
          while (cont  <= 6){
            System.out.println("Boa noite! cont = " + cont);
            cont ++;
        }
        
        System.out.println("cont = " + cont);
        
        for (Integer i = 1; i <= 6; i++){
            System.out.println("Boa noite! i = " + i);
        }
        
        do {  
            System.out.println("Digite um número positivo.");
            numero = leitor.nextInt();
        } while (numero < 0);
        
        while(numero < 0){
            System.out.println("Número inválido! Digite Novamente");
            numero = leitor.nextInt();
        }
        
        numero = -1;
        
        while (numero < 0){
            System.out.println("Digite um número positivo!");
            numero = leitor.nextInt();
       }   
    }
}

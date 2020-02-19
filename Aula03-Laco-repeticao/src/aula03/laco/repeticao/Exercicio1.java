/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03.laco.repeticao;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exercicio1 {
    
    public static void main(String[] args) {
        
       Scanner lerNumero = new Scanner(System.in);
       
       Integer numero = 0, cont = 0;
       
       while (cont < 5){
           System.out.println("Digite um número. ");
           numero += lerNumero.nextInt();
           System.out.println("A soma é: " + numero);
           cont ++;
       }
       
        
    }
    
}

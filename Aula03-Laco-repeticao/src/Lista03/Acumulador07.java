/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista03;

import java.util.Scanner;

/**
 *
 * @author amlopes1
 */
public class Acumulador07 {
    public static void main(String[] args) {
        Integer numero, soma = 0;
        
        Scanner LeitorNum = new Scanner(System.in);
        
        System.out.println("Por favor, digite um número. ");
        numero = LeitorNum.nextInt();
        soma += numero;
      
        while (numero != 0) {            
            System.out.println("Por favor, outro digite um número. ");
            numero = LeitorNum.nextInt();
            soma += numero;
            
            System.out.println("Soma dos números digitados " + soma);
        }
    }
}

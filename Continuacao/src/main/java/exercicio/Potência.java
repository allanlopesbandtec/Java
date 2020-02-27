/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import java.util.Scanner;

/**
 *
 * @author amlopes1
 */
public class Potência {
    public static void main(String[] args) {
        
        Integer potencia = 1, expoente, base = 0;
        
        Scanner LeitorNum = new Scanner(System.in);
        
        
        System.out.println("Digite a base da potência.");
        base = LeitorNum.nextInt();
        System.out.println("Digite o expoente da potência.");
        expoente = LeitorNum.nextInt();
        System.out.println("\n");
        
        for (Integer i = 0; i < expoente; i++) {
            System.out.println(base + " ^ " + expoente + " = " + (potencia *= base ) );
            
            
        }
    }
}

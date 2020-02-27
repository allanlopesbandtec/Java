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
public class Login {
    public static void main(String[] args) {
        
        String login, senha;
        
        Scanner Leitor = new Scanner(System.in);
        
         System.out.println("Por favor, digite o login.");
         login = Leitor.nextLine();
        
         System.out.println("Por favor, digite a senha.");
         senha = Leitor.nextLine();
        
         
        while (!login.equals("admin") || !senha.equals("#Bandtec")) {            
             System.out.println("Por favor, digite o login.");
             login = Leitor.nextLine();
        
             System.out.println("Por favor, digite a senha.");
             senha = Leitor.nextLine();
             
             System.out.println("Login e/ou senha inválidos");
        }
        
        System.out.println("Login válido!");
 
    }
}

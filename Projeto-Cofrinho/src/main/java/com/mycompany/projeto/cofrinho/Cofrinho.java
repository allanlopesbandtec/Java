/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.cofrinho;

/**
 *
 * @author Aluno
 */
public class Cofrinho {
    Integer saldo = 0;
    
    void depositar(){
        saldo += 50;
    }
    void sacar(){
        if(saldo >= 50){
         saldo -= 50;
        }
    }
    void quebrar(){
         saldo = 0;
    }
}

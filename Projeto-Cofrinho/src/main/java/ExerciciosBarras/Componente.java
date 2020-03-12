/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosBarras;

import java.util.Random;

/**
 *
 * @author Aluno
 */
public class Componente {
       
    Random gerador = new Random();
    Integer valor = 0;
    String texto = "", cor = "#000";
 
    
    void atualizarDados(){
      valor = gerador.nextInt(101);
      atualizarStatus();
    }
    
    void atualizarStatus(){
        if(valor >= 70){
            texto = "Status: suave";
            cor = "#6ab04c";
        }
        else if(valor >= 20 && valor < 70){
            texto = "Status: Atenção";
            cor = "#f9ca24";
        }
        
        else{
            texto = "Status: Crítico";
            cor = "#eb4d4b"; 
        } 
    }
    
}

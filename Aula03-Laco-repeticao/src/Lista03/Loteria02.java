
package Lista03;

import java.util.Random;
import java.util.Scanner;


public class Loteria02 {
    public static void main(String[] args) {
        
       int numero = 0, sorteado = 0, sorteios = 1;
       Scanner LeitorNum = new Scanner(System.in);
       
       
       Random aletorio = new Random();
       
        for (Integer cont = 0; cont < 10; cont++){
            sorteado = aletorio.nextInt(10);
        }
       
        System.out.println(sorteado);
        
        System.out.println("Por favor, digite um número de 0 a 10.");
        numero = LeitorNum.nextInt();
        
        for(Integer cont = 0; numero != sorteado; cont++){
            System.out.println("Por favor, digite um número de 0 a 10.");
            numero = LeitorNum.nextInt();
            sorteios++;
        }
        
        if(sorteios <= 3){
            System.out.println("Você é MUITO sortudo!" + "Tentou " + sorteios + " vezes");
        }
        
        else if(sorteios <= 10){
            System.out.println("Você é sortudo! " + "Tentou " + sorteios + " vezes");
        }
        
        else{
            System.out.println("É melhor você ser trabalhador!" + "Tentou " + sorteios + " vezes");
        }
    }
}

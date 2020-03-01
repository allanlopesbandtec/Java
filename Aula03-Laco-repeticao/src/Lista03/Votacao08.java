
package Lista03;

import java.util.Scanner;


public class Votacao08 {
    public static void main(String[] args) {
       
        Scanner LeitorNum = new Scanner(System.in);
        
        Integer IdVoto = 0, mussarela = 0, calabresa = 0, queijos = 0;
        
        for (Integer i = 0; i < 10; i++) {
            
            System.out.println("Vote no seu sabor de pizza.");
            IdVoto = LeitorNum.nextInt();
            
            if (IdVoto == 5){
                System.out.println("Voto enviado!");
                mussarela++;
            }
            
            else if (IdVoto == 25){
                System.out.println("Voto enviado!");
                calabresa++;
            }
            
            else if(IdVoto == 50){
                System.out.println("Voto enviado!");
                queijos++;
            }
            
            else{
                System.out.println("Voto inválido!");
                i--;
            }
            
        }
        
          System.out.println("Mussarela obteve " + mussarela + " votos.");
          System.out.println("Calabresa obteve " + calabresa + " votos.");
          System.out.println("Quatro queijos obteve " + queijos + " votos.");
          
        if (mussarela > calabresa && mussarela > queijos) {
            System.out.println("O sabor favorito é a mussarela!");
        }
         
        else if (calabresa > mussarela && calabresa > queijos){
            System.out.println("O sabor  favorito é a calabresa!");
        }
        
        else{
            System.out.println("O sabor  favorito é o quatro queijos!");
        }
    }
}

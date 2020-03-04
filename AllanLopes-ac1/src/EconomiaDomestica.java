
import java.awt.datatransfer.DataFlavor;
import java.util.Scanner;

/*
 Como você é um excelente programador(a), ajude Diego criando uma classe Java que:

a) Seja executável

b) Pergunte ao usuário seu primeiro nome

c) Pergunte 7 vezes o valor do depósito realizado com uma frase como esta:
"Valor depositado no Xº dia:", onde X vai de 1 a 7.

d) Ao receber o valor de cada depósito, apenas aceite valores de 0,01; 0,05; 0,10; 0,25; 0,50 e 1,00,
afinal são as únicas moedas que temos.
Ignore qualquer outro valor, considerando que foi depositado nada.

e) Após os 7 depósitos, exiba uma frase com esta: "Ao final de 7 dias, X guardou R$Y".
Onde X é o nome recebido no item b) e Y é a soma de todos os depósitos válidos.
Use a técnica da interpolação e arredonde os valores monetários exibidos para 2 casas decimais.

 */
public class EconomiaDomestica {
    public static void main(String[] args) {
        
        
        Scanner Leitor = new Scanner(System.in);
        
        Scanner LeitorNum = new Scanner(System.in);
        
        String nome;
        Integer dia = 0;
        Double deposito = 0.00, cofre = 0.00;
        
        
        System.out.println("Por favor, digite seu nome: ");
        nome = Leitor.nextLine();
        
        
        while (dia < 7) {            
            
            System.out.println(String.format("Valor depositado no %dº dia: ", ++dia));
            deposito = LeitorNum.nextDouble();
           
            
            if (deposito == 0.01 || deposito == 0.05 || deposito == 0.10 || deposito == 0.25 || deposito == 0.50 ||deposito == 1.0) {
                cofre += deposito;
            }
            
            else{
                System.out.println("Nada depositado.");
                cofre += 0.00;
            }   
        }
   
        System.out.println(String.format("Ao final de 7 dias, %s guardou R$%.2f", nome, cofre));
    }
}


package Lista03;

import java.util.Scanner;

public class Tabuada01 {
    public static void main(String[] args) {
        
        int numero, cont = 0;
        Scanner LeitorNum = new Scanner(System.in);
        
        System.out.println("Por favor, digite um número ");
        numero = LeitorNum.nextInt();
        
        
        while (cont <= 10){
            System.out.println(/* "\n" + */numero + " " + "x" + " " + cont + " " + "=" +  " " + (numero * cont) );
            cont ++;
        }
    }
}

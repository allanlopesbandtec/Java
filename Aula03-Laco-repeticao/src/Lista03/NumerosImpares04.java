
package Lista03;


public class NumerosImpares04 {
    
    public static void main(String[] args) {
     
    Integer impar = 0;
            
    for(Integer cont = 0; cont <= 90; cont ++){
         impar = cont % 2;
            if (impar == 1){
                System.out.println(cont);
            }
        }      

    } 
}

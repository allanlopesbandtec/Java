
package Lista03;


public class NumerosPares03 {
    public static void main(String[] args) {
        
        Integer numero = 1, par;
        
        while(numero <= 40){
           par = numero % 2;
            if (par == 0){
                System.out.println(numero);
            }
            numero++;
        }
    }
}


package evenandodd;

import java.util.Scanner;


public class EvenAndOdd {

    
    public static void main(String[] args) {
        
            Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        if(x%2==0){
            if(x!=0){
                System.out.println("Even");
            }else{
                System.out.println("Zero");
            }
        }
        else {
            System.out.println("Odd");
        }




        
        
        
        
        
        
        
      
    }
    
}

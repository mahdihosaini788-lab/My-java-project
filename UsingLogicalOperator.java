package using.logical.operator;
import java.util.Scanner;
public class UsingLogicalOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Enter an integer number:  ");
        int num = input.nextInt();
        
        boolean a = num%5==0 && num%6==0;
        boolean b = num%5==0 || num%6==0;
        boolean c = num%5==0 ^ num%6==0;

        System.out.println("Is "+num+" divisible by 5 and 6 ? "+ a);
        System.out.println("Is "+num+" divisible by 5 or 6 ? "+ b);
        System.out.println("Is "+num+" divisible by 5 or 6, but not both? "+ c);

    }
    
}

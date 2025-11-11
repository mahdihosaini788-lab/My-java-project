package palindrom.integer;
import java.util.Scanner;
public class PalindromInteger {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter three digits in integer ");
        int num = input.nextInt();
        num = Math.abs(num);
        int a  = num%10;
        num = num/10;
        int b = num%10;
        num = num/10;
        int c = num%10;
        if(a==c)
        System.out.println(""+a+b+c+"  is palindrom");
        else System.out.println(""+a+b+c+ "  is not palindrom");
    }
    
}

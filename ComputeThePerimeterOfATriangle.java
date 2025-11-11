package compute.the.perimeter.of.a.triangle;
import java.util.Scanner;
public class ComputeThePerimeterOfATriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the a number");
        float a = input.nextFloat();
        System.out.println("Enter the b number");
        float b = input.nextFloat();
        System.out.println("Enter the c number");
        float c = input.nextFloat();
        
        if(a+b>c && a+c>b && b+c>a)
            System.out.println("The perimeter of a triangle is "+(int)(a+b+c));
        else System.out.println("It cannot be the perimeter of a triangle");
    }
    
}

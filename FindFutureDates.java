
package findfuturedates;

import java.util.Scanner;

public class FindFutureDates {

    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter today's day");
        int day = input.nextInt();
         System.out.println("Enter future day");
        int futureDay = input.nextInt();
        
        
        if(day==0&&futureDay==1)
            System.out.println("Today is sunday and the future day is Monday");
        else if(day==0&&futureDay==2)
                    System.out.println("Today is sunday and the future day is Tuesday");
        else if(day==0&&futureDay==3)
                    System.out.println("Today is sunday and the future day is Wednesday");
        else if(day==0&&futureDay==4)
                    System.out.println("Today is sunday and the future day is Thursday");
         else if(day==0&&futureDay==5)
                    System.out.println("Today is sunday and the future day is Friday");
         else if(day==0&&futureDay==6)
                    System.out.println("Today is sunday and the future day is Saturday");
         else if(day==1&&futureDay==2)
                    System.out.println("Today is Monday and the future day is Tuesday");
         else if(day==1&&futureDay==3)
                    System.out.println("Today is Monday and the future day is Wednesday");
         else if(day==1&&futureDay==4)
                    System.out.println("Today is Monday and the future day is Thursday");
         else if(day==1&&futureDay==5)
                    System.out.println("Today is Monday and the future day is Friday");
         else if(day==1&&futureDay==6)
                    System.out.println("Today is Monday and the future day is Saturday");
         else if(day==2&&futureDay==3)
                    System.out.println("Today is Tuesday and the future day is Wednesday");
         else if(day==2&&futureDay==4)
                    System.out.println("Today is Tuesday and the future day is Thursday");
         else if(day==2&&futureDay==5)
                    System.out.println("Today is Tuesday and the future day is Friday");
         else if(day==2&&futureDay==6)
                    System.out.println("Today is Tuesday and the future day is Saturday");
         else if(day==3&&futureDay==4)
                    System.out.println("Today is Wednesday and the future day is Thursday");
        else if(day==3&&futureDay==5)
                    System.out.println("Today is Wednesday and the future day is Friday");
        else if(day==3&&futureDay==6)
                    System.out.println("Today is Wednesday and the future day is Saturday");
        else if(day==4&&futureDay==5)
                    System.out.println("Today is Thursday and the future day is Friday");
        else if(day==4&&futureDay==6)
                    System.out.println("Today is Thursday and the future day is Saturday");
        else if(day==5&&futureDay==6)
                    System.out.println("Today is Friday and the future day is Saturday");
        else if(day==6)
                    System.out.println("Today is Saturday");            
        
    }
    
}

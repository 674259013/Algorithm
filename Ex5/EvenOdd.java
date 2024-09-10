package Ex5;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] arg){
    Scanner numEOSC = new Scanner(System.in);

    System.out.print("Enter number : ");
    int number = numEOSC.nextInt();

    if ((number % 2) == 0) 
    {
        System.out.println("The number " + number + " is Even");
    }
    else        
    {
        System.out.println("The number " + number + " is Odd");
    }

    numEOSC.close();
    }
}

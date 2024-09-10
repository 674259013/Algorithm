 package Ex5;

import java.util.Scanner;

class TestOneif {

    public static void main (String[] arg){
        Scanner ifNumSC = new Scanner(System.in);

        System.out.print("Enter number : ");
        int numberSC = ifNumSC.nextInt();

        if (numberSC > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Non Positive");
        }

        System.out.println("End program");
        
        ifNumSC.close();
    } 
}
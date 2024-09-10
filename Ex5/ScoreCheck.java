package Ex5;

import java.util.Scanner;

public class ScoreCheck {

    public static void main(String[] arg){
        Scanner scoreSC = new Scanner(System.in);

        System.out.print("Enter you midterm score : ");
        float midSC = scoreSC.nextFloat();
        System.out.print("Enter you final score : ");
        float finalSC = scoreSC.nextFloat();

        float total = midSC + finalSC ;

        String totalText = "You total socre is ";
        String result = " . The result is";

        if (total >= 50)
        {
            System.out.println( totalText + total + result + " Pass!!!");
        } 
        else
        {
            System.out.println( totalText + total + result + " Fail!!!");
        }
    scoreSC.close();
    }
}
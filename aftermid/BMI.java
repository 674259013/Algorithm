package aftermid;

import java.util.Scanner;

public class BMI {
    public static void main (String[] arg){
        Scanner weightSC = new Scanner(System.in);
        Scanner heightSC = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms : ");
        float weightEnter = weightSC.nextFloat();
        System.out.print("Enter your height in meters : ");
        float heightEnter = heightSC.nextFloat();

        float BMI = weightEnter/(heightEnter*heightEnter);

        System.out.println("You BMI for weight = " + weightEnter + "kg and height = " + heightEnter + "meters is " + BMI +"bmi") ;

        weightSC.close();
        heightSC.close();
    }
}

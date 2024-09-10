package Ex5;

import java.util.Scanner;

public class TriBmi {

    public static void main (String[] arg){
        Scanner TriBMISC = new Scanner(System.in);

        System.out.println("1 = cal tri area\n2 = cal BMI");
        System.out.print("Enter a number ");
        int checkSC = TriBMISC.nextInt();

        if (checkSC == 1)
        {
            System.out.print("Enter the base of triangle : ");
            float base = TriBMISC.nextFloat();
            System.out.print("Enter the height of triangle : ");
            float hight = TriBMISC.nextFloat();

            float Area = (hight/2)*base;

            System.out.println("Area of the treiangle :" + Area + " square units");
        }
        if (checkSC == 2)
        {
            System.out.print("Enter your weight in kilograms : ");
            float weight = TriBMISC.nextFloat();
            System.out.print("Enter you height in meters : ");
            float height = TriBMISC.nextFloat();

            float BMI = weight*(height*height);

            System.out.println("You BMI for weight = " + weight + " kgs and heiht = " + height + " meters is : " + BMI + " bmi. ");
        }
        
        System.out.println("ByeBye");

        TriBMISC.close();
    }
}

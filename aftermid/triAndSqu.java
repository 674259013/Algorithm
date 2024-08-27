package aftermid;

import java.util.Scanner;

public class triAndSqu {

    public static void main (String[] arg){
        Scanner baseSC = new Scanner(System.in);
        Scanner hightSC = new Scanner(System.in);
        Scanner lengthSC = new Scanner(System.in);
        Scanner widthSC = new Scanner(System.in);

        System.out.print("Enter base of Triangle : ");
        float baseEnter = baseSC.nextFloat();
        System.err.print("Enter hight of Triangle : ");
        float hightEnter = hightSC.nextFloat();

        float triangleArea = (baseEnter/2)*hightEnter;

        System.out.println("Area of Triangle = " + triangleArea + " square units");

        System.out.println("-------------------------------------");

        System.out.print("Enter length of square : ");
        float lengthEnter = lengthSC.nextFloat();

        float rectangleArea =  lengthEnter*lengthEnter;

        System.out.println("Area of rectangle = " + rectangleArea + " suqare units");;

        baseSC.close();
        hightSC.close();
        lengthSC.close();
        widthSC.close(); 
    }
}


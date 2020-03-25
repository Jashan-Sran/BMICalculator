package com.durgaSoftwareUdemy;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        BMI bmi = new BMI();
        bmi.calculate();
    }
}
 class BMI
 {
     public void calculate()
     {
        Scanner scr = new Scanner(System.in);
        System.out.println( " Enter your weight in kilograms : " );
        double weight = scr.nextDouble();
        System.out.println( " Enter your height in inches : " );
        double height = scr.nextDouble();
        height = height/39;
         double BMI = weight/(height*height);
         if(BMI<=18.5)
         {
             System.out.println( " Your BMI is  " + BMI + " and you are UnderWeight " );
         }
         else if(BMI >18.5 && BMI<=25)
         {
             System.out.println( " Your BMI is  " + BMI + " and you are Normal " );
         }
         else if(BMI>25 && BMI <=29.9)
         {
             System.out.println( " Your BMI is  " + BMI + " and you are OverWeight " );
         }
         else
         {
             System.out.println( " Your BMI is  "+BMI + " and you are Obese " );
         }
    }
}


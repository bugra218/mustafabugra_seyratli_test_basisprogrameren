package be.intecbrussel;

import java.util.Scanner;

import static be.intecbrussel.Solutions.*;

public class BasicProgrammingApp {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please write the first number");
        int userNumber1 = scan1.nextInt();
        System.out.println("Please write the first second");
        int userNumber2 = scan1.nextInt();
        System.out.println("Please write the first third");
        int userNumber3 = scan1.nextInt();
        System.out.println("Please write the first fourth");
        int userNumber4 = scan1.nextInt();
        int biggestResult = biggestNumber(userNumber1,userNumber2,userNumber3,userNumber4);
        int smallestResult= smallestNumber(userNumber1,userNumber2,userNumber3,userNumber4);
        System.out.println("biggest number is " + biggestResult);
        System.out.println("biggest number is " + smallestResult);
        smallestNumberToMean(userNumber1,userNumber2,userNumber3,userNumber4,smallestResult);
        zeroToTwo(userNumber1,userNumber2,userNumber3,userNumber4);
        zeroToHundred();





    }
}

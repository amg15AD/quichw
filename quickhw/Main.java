package quickhw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double totalFee = 0;

        Scanner scan = new Scanner((System.in));

        System.out.println("What are you buying?");
        String product = scan.next();

        System.out.println("What is the price?");
        int price = scan.nextInt();

        System.out.println("How many would you like?");
        int count = scan.nextInt();

        System.out.println("How far will we be delivering");
        double miles = scan.nextInt();

        if(miles <= 4 && miles >= 0 ) {
            totalFee = 2.0;
        }else if (miles <= 15 && miles > 4) {
            totalFee = 5.0;
        } else if (miles <= 25 && miles > 15) {
            totalFee = 10.0;
        }else if (miles <= 50 && miles > 25){
               totalFee = 15.0;
        }else if (miles > 50){
               totalFee = 20.0;}

        double endTotal = (count * price) + totalFee;
        System.out.println("Thank you, your " + product + " will be "+ endTotal);

//          what type of product are you buying?
//          what is the price?
//          what is the qty?
//          how far away / distance do you want it delivered to?
          /*  double totalCost = (pPerUnit * qty) + totalFee;
            System.out.println("Your total is " + totalCost );*/
            }
        }


//    GIVEN THE DATA BELOW!
//            ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//    Distance 	    = Fee
//									0 -  4 miles  = $2
//									5 - 15 miles  = $5
//									16 - 25 miles = $10
//									26 - 50	miles = $15
//    More than 50 miles = $20
//     +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//
//
//
//    WRITE A PROGRAM THAT CALCULATES TOTAL COST OF USER'S ITEMS
//
//
//    Product      Qty      Price       Miles      Total
//			----         ---      -----      -----      -----
//    Rice          20        5.0       10.0      105.0
//
//    Thank you. Come Again!!!



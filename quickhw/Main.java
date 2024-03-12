package quickhw;

public class Main {
    public static void main(String[] args) {
        int qty = 20;
        double pPerUnit = 5.0;
        double miles = 25.0;
        double totalFee = 0;

        if(miles <= 4) {
            totalFee = 2.0;
        }else if (miles <= 15 ) {
            totalFee = 5.0;
        } else if (miles <= 25) {
            totalFee = 10.0;
        }else if (miles <= 50){
               totalFee = 15.0;
        }else if (miles > 50){
               totalFee = 20.0;}

//            String rice;
//            String productName = rice;
            double totalCost = (pPerUnit * qty) + totalFee;
            System.out.println("Your total is " + totalCost );

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



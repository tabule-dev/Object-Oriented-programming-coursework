
package company.skmotorsauction;

import java.util.Scanner;
public class SKMotorsAuction {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //vehicle details
        System.out.println("Enter vehicle registration number: ");
        String regNumber = input.nextLine();
        
        System.out.print("Enter vehicle cost:");
        double vehicleCost = input.nextDouble();
        
        System.out.println("Enter balance left on vehicle:");
        double balance = input.nextDouble();
        
        
        //bids from bidders 
        
        System.out.println("\n Enter bids from 3 bidders:");
        
        System.out.print("Bidder 1:");
        Double bid1 = input.nextDouble();
        
         System.out.print("Bidder 2:");
        Double bid2 = input.nextDouble();
        
         System.out.print("Bidder 3:");
        Double bid3 = input.nextDouble();
        
        //determining highest 
        
        double highestBid = bid1;
        String winner = "Bidder 1";
        
        if ( bid2 > highestBid ){
            highestBid = bid2;
            winner = "Bidder 2";
        }
        if ( bid3 > highestBid){
            highestBid =bid3;
            winner = "Bidder 3";
        }
        
        //DISPLAYING WINNER 
        
        System.out.println("\nHighest bidder is " + winner + "with bid:" +highestBid);
        
        
        //capturind deposits and expenses 
        
        System.out.print("Enter total deposits recieved: ");
        double deposits = input.nextDouble();
        
        System.out.print("Enter any additional expenses:");
        double expenses = input.nextDouble();
        
        //profits or losses 
        
        double totalCost = vehicleCost + expenses + balance;
        double profitOrloss = deposits -totalCost;
        
        System.out.println("\n--- Vehicle Details ----");
        System.out.println("Registration Number: " + regNumber);
        System.out.println("Vehicle cost: "+ vehicleCost);
        System.out.println("Balance left:" + balance);
        System.out.println("Total recieved: " + deposits);
        System.out.println("Expenses Incurred: " + expenses);
        
        if (profitOrloss >= 0){
            System.out.println("profit Made   : " +profitOrloss);
        }
        else {
            System.out.println("Loss Made    : + (-profitOrLoss");
            
        }
       input.close();
    }
}

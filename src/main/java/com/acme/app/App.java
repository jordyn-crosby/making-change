package com.acme.app;

/*
public class Wallet {
    int quarters;
    int dimes;
    int nickels;
    int pennies;

    Wallet() {
        this.quarters = 0;
        this.dimes = 0;
        this.nickels = 0;
        this.pennies = 0;
    }

    Wallet(int quarters, int dimes, int nickels, int pennies) {
        this.quarters = quarters;
        this.dimes = dimes;
        this.nickels = nickels;
        this.pennies = pennies;
    }
}
*/

/**
 * Hello world!
 *
 */
public class App 
{
    App() {
        this.wallet = new Wallet();
    }

    public int quarters(int remainingCents) {
        this.wallet.quarters += remainingCents / 25;
        remainingCents = remainingCents % 25;
    }

    public void run(int remainingCents) {
        System.out.println("\nPart 2: Making Change\n");
        
        // write code that gives exact change with the least number of coins for a given number of cents. Use intermediate variables to help your calculation. 
        
        // Sample Output: 5 quarters, 1 dimes, 0 nickels, 2 pennies. 
        // your code here...

        int quarters = remainingCents / 25;
        remainingCents -= quarters * 25;

        int dimes = remainingCents / 10;
        remainingCents -= dimes * 10;

        int nickels = remainingCents / 5;
        remainingCents -= nickels * 5;

        int pennies = remainingCents / 1;
        remainingCents -= pennies;

        while(remainingCents > 0) {
            if(remainingCents >= 25) {
                quarters = remainingCents / 25;
                remainingCents -= quarters * 25;
            } else if(remainingCents >= 10) {
                dimes = remainingCents / 10;
                remainingCents -= dimes * 10;
            } else if(remainingCents >= 5) {
                nickels = remainingCents / 5;
                remainingCents -= nickels * 5;
            } else {
                pennies = remainingCents;
                remainingCents -= pennies; //should equal 0
            }
        }
        
        System.out.print(quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, " + pennies + " pennies");
    }

    public static void main( String[] args )
    {
        System.out.println("\nPart 2: Making Change\n");

        App app = new App();
   
        // write code that gives exact change with the least number of coins for a given number of cents. Use intermediate variables to help your calculation. 
        // test with different numbers (not just 137)!
        
        // Sample Output: 5 quarters, 1 dimes, 0 nickels, 2 pennies. 
        // your code here...

        app.run(137);
        app.run(100);
    }
}


//Guessing numbers high or lower
package guessinggame;

// Date : August 12, 2016
// @author martecwilson

import java.util.Random;
import javax.swing.JOptionPane;
public class GuessingGame 
{
    public static void main(String[] args )
    {
    Random rand = new Random ();
    int numberToGuess = rand.nextInt(1000);
    int numberOfTries = 0;
    int myGuess = 0;
    boolean bValidInput = false;
    int nUserNumber;
    
    System.out.println("Guess a number");
    
    if ( myGuess == numberToGuess)
    {
        
    } else if (myGuess < numberToGuess)
    {
        System.out.println("Your guess is too low");
    }
    else if (myGuess > numberToGuess)
    {
        System.out.println("Your guess is too high");
    }
    
    while (!bValidInput)
    {
    String strUserNumber = JOptionPane.showInputDialog("Input a number:");

    JOptionPane.showConfirmDialog(null, "Wrong number! Try again");
    }
    }
    
}


//Random number generator

package highlowgame;

import java.util.Random;
import javax.swing.JOptionPane;

 // @author martecwilson

public class HighLowGame {

    public static void main(String[] args) 
    {
        String strContinue = "Y";
        int nPlayCount;
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        for (int nNumbersToGen = 1; nNumbersToGen <= 100; ++nNumbersToGen)
        {
            int nRandomNum = rand.nextInt(1002) + 15;
        
            System.out.println("The random number is: " + nRandomNum);
        }

        for (nPlayCount = 0; strContinue.toLowerCase().equals("y"); nPlayCount++)
           {
            // Game logic
            JOptionPane.showConfirmDialog(null, "This is HiLo game notification...");

            // Game is done.
            // Ask the user to play another game?
            strContinue = JOptionPane.showInputDialog("Do you want to play again (Y/N)?");
            nPlayCount++;
            ++nPlayCount;
        }
        
        System.out.println("You played " + nPlayCount + " games...");

    }
}

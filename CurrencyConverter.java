
package currencyconverter;
/**
 *
 * @author mariowilson
 */
public class CurrencyConverter
{
    /*  Method Header example
    Name: GetCount
    Parameters:
        iValue - integer value of the amount being divided
        iDenominator - the divisor used to divide iValue
    
    Returns:
        The number of times iDenominator can be evenly divided into iValue
    
    Histor:
        Ed Mahon - Creation: October 31, 2014
     */
    private static int GetCount(int iValue, int iDenominator)
    {
        int iCount = 0;
        
        iCount = iValue / iDenominator;
        
        return iCount;
    }
    private static int GetRemainder(int iValue, int iDenominator)
    {
       int iRemainder = 0;
       int iCount = 0;

       // Reuse the existing method to get the number of items (count)
       iCount = GetCount(iValue, iDenominator);
       
       iRemainder = iValue - (iCount * iDenominator);
       
       return iRemainder;
    }
    
    public static void main(String[] args)
    {
        // Declare constants
        final int I_QUARTER = 25;
        final int I_DIME = 10;
        final int I_NICKLE = 5;
    
        double dMoneyValue = 1.15;
        int iMoneyValue = (int)Math.round(dMoneyValue * 150);
        int iNumQuarters = 0;
        int iNumDimes = 0;
        int iNumNickles = 0;

        iNumQuarters = GetCount(iMoneyValue, I_QUARTER);
        iMoneyValue = GetRemainder(iMoneyValue, I_QUARTER);
        // New 
        iNumDimes = GetCount(iMoneyValue, I_DIME);
        iMoneyValue = GetRemainder(iMoneyValue, I_DIME);

        iNumNickles = GetCount(iMoneyValue, I_NICKLE);
        iMoneyValue = GetRemainder(iMoneyValue, I_NICKLE);
        
        System.out.println("Answer: " + iNumQuarters + " quarters, " + iNumDimes + " dimes, " + iNumNickles + " nickles, " + iMoneyValue + " pennies");
    }
}

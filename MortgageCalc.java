import java.text.NumberFormat;
import java.time.Period;
import java.time.Year;
import java.util.Scanner;
 
public class MortgageCalc {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEARS = 12;
        final byte PERCENT=100;

        Scanner scanner= new Scanner(System.in);
        System.out.print("Principal");
        int principal = scanner.nextInt();
        System.out.print("Annual Interest rate:");
        float annualInterest=scanner.nextFloat();
        float monthlyInterest=annualInterest/PERCENT/MONTHS_IN_YEARS;
        System.out.print("Period(Years)");
        byte Years = scanner.nextByte();
        int numberOfPayments= Years*MONTHS_IN_YEARS;
        double mort= principal*(monthlyInterest*Math.pow(1+monthlyInterest,numberOfPayments))/(Math.pow(1+monthlyInterest, numberOfPayments)-1);
       String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mort);
       System.out.println("mortgage" + mortgageFormatted);
      
    }

    
}
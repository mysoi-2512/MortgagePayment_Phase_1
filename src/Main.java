import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner =new Scanner(System.in);

        System.out.print("Principle: ");
        double principle = scanner.nextDouble();

        System.out.print("Annual Interest Rate: ");
        double annualRate = scanner.nextDouble();
        double monthlyRate = annualRate / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int months = years * MONTHS_IN_YEAR;

        double mortgage = principle * monthlyRate * Math.pow( 1 + monthlyRate, months) / (Math.pow( 1 + monthlyRate, months) - 1);
        String mortgagePayment = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.print("Mortgage Payment: " + mortgagePayment);
    }
}
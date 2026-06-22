import java.util.*;

public class recursion {

    static double financeCalc(int years, double previousValue, double rate) {
        if (years == 0) {
            return previousValue;
        }
        return financeCalc(years - 1, previousValue * (1 + rate / 100), rate);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int years = sc.nextInt();

        System.out.print("Enter the principal amount: ");
        double previousValue = sc.nextDouble();

        System.out.print("Enter the rate: ");
        double rate = sc.nextDouble();

        if (years < 0) {
            System.out.println("Calculation not possible");
        } else {
            double result = financeCalc(years, previousValue, rate);
            System.out.println(result);
        }

        sc.close();
    }
}
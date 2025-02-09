//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double balance = 5000.0;
        double annualInterestRate = 17.0;

        double monthlyInterestRate = annualInterestRate / 12 / 100;

        double interestAfterOneMonth = balance * monthlyInterestRate;
        double balanceAfterOneMonth = balance + interestAfterOneMonth;

        double interestAfterTwoMonths = balanceAfterOneMonth * monthlyInterestRate;
        double balanceAfterTwoMonths = balanceAfterOneMonth + interestAfterTwoMonths;

        System.out.println("Initial Balance: $" + balance);
        System.out.println("Annual Interest Rate: " + annualInterestRate + "%");
        System.out.println("Interest Due After 1 Month: $" + String.format("%.2f", interestAfterOneMonth));
        System.out.println("Balance After 1 Month: $" + String.format("%.2f", balanceAfterOneMonth));
        System.out.println("Interest Due After 2 Months: $" + String.format("%.2f", interestAfterTwoMonths));
        System.out.println("Balance After 2 Months: $" + String.format("%.2f", balanceAfterTwoMonths));
        }
    }

import java.util.ArrayList;
import java.util.Scanner;

class Bank1 {
    double amount1;
    Bank1(double amount1){
        this.amount1 = amount1;
    }
}
////class Bank2{
////    double amount2;
////    Bank2(double amount2){
////        this.amount2 = amount2;
////    }
////}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Bank1> accountStatus = new ArrayList<>();
        while (true) {
            System.out.println("1. Deposit: ");
            System.out.println("2. Disbursement: ");
            int select = scanner.nextInt();

            if (select == 1) {
                Deposit(scanner, accountStatus);
            } else if (select == 2) {
                payment(scanner, accountStatus);
            } else {
                System.out.println("Incorrect choice:");
            }
        }
    }
    public static void Deposit(Scanner scanner, ArrayList<Bank1> accountStatus) {
        System.out.println("Enter the amount to be deposited: ");
        double amount1 = scanner.nextDouble();

        Bank1 bank1 = new Bank1(amount1);
        accountStatus.add(bank1);

        double total = 0;
        for (Bank1 bank : accountStatus) {
            total += bank.amount1;

        }
        System.out.println("Added payment to account ");
        System.out.println("Balance: " + total);
    }
    public static void payment(Scanner scanner, ArrayList<Bank1> accountStatus) {
        System.out.println("Enter the amount to be paid: ");
        double amount2 = scanner.nextDouble();

        for (Bank1 bank : accountStatus){
            //double a = subtract(bank.amount1,amount2);

            // System.out.println("Your balance after withdrawal is: " + a);
            if (amount2 > bank.amount1){
                System.out.println("\nNo funds available for withdrawal: ");
            }else {
                bank.amount1 = subtract(bank.amount1,amount2);
                System.out.println("Your balance after withdrawal is: " +  bank.amount1);
            }
        }

    }
    public static double subtract(double a, double b){
        return a-b;
    }
}
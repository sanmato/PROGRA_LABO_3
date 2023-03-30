import java.util.Scanner;
import java.util.UUID;

public class BankAccount {
    private static String id = UUID.randomUUID().toString().toLowerCase().substring(0, 8);
    private double balance;
    private CustomerAccount customer;
    private double negativeBalance = 2000;

    public BankAccount(double balance, CustomerAccount customer) {
        this.balance = balance;
        this.customer = customer;
    }

    public BankAccount() {}

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        BankAccount.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public CustomerAccount getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerAccount customer) {
        this.customer = customer;
    }

    public double getNegativeBalance() {
        return negativeBalance;
    }

    public void setNegativeBalance(double negativeBalance) {
        this.negativeBalance = negativeBalance;
    }


    @Override
    public String toString() {
        return "BankAccount [id= "+ id + ", balance=" + balance + 
        ", negative balance limit=" + negativeBalance + ", customer=" + customer + "]";
    }

    public double creditTransaction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much money do you want to deposit?");
        double amountToDeposit = scanner.nextDouble();
        scanner.nextLine();
        double newBalance;

        if(negativeBalance != 2000 && amountToDeposit > 0) {
            newBalance = balance+amountToDeposit - (2000-negativeBalance); //SI TIENE SALDO DEUDOR
            setNegativeBalance(2000);
            setBalance(newBalance);
            return newBalance;
        } else {
            newBalance = balance+amountToDeposit; //CASO NORMAL, NO DEBE SALDO
            setBalance(newBalance);
            return newBalance;
        }
        
    }

    public double extractTransaction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much money do you want to extract?");
        double amountToExtract = scanner.nextDouble();
        scanner.nextLine();      

        double newBalance;
        if(amountToExtract > balance) {
            if(amountToExtract - balance > negativeBalance) {
                System.out.println("Insufficient balance to extract $" +amountToExtract +"!\n");
                System.out.println("Available: $"+balance+ "and "+negativeBalance+"to negative limit");
                return balance;
            } else {
                double negativeAmount = amountToExtract - balance;
                negativeBalance = negativeBalance - negativeAmount;
                setBalance(0);
                return negativeBalance;
            }
        }
        else {
            newBalance = balance - amountToExtract;
            setBalance(newBalance);
            return newBalance;
        }
    }
}

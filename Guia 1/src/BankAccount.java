
public class BankAccount {
    private int id;
    private String name;
    private double balance;


    public BankAccount(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public double getBalance() {
        return balance;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    

    public double depositTransaction(double moneyToDeposit) {
        double newBalance = balance + moneyToDeposit;
        setBalance(newBalance);
        return newBalance;
    }

    public double extractTransaction(double moneyToExtract) {
        double newBalance;
        if(moneyToExtract > balance) {
            System.out.println("Not enough balance in account to extract $" + moneyToExtract +"!");
            return balance;
        } else {
            newBalance = balance - moneyToExtract;
            setBalance(newBalance);
            return newBalance;
        }
    }

    @Override
    public String toString() {
        return"CuentaBancaria[id=" + id + ", nombre=" + name + ", saldo=" + balance + "]";
    }

}
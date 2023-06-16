public class SavingAccount {
    private String name;
    private double balance;
    private double interestRate;

    public SavingAccount(String name, double balance, double interestRate) {
        this.name = name;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void deposit(double cash) {
        double depositAmount = interestRate * balance + cash;
        balance += depositAmount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Saldo Tidak Mencukupi!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
}
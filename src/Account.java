public class Account {

    double balance;
    String name;

    public Account() {
        this.balance = 0;
        this.name = "No One";
    }

    public Account(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public double withdraw(double withDrawThisMuch) {
        double newBalance = this.balance - withDrawThisMuch;
        return newBalance;
    }
    public double deposit(double depositThisMuch){

        double newBalance = this.balance + depositThisMuch;

        return newBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return name + " ditt saldo är " + balance + " SEK";
    }

}

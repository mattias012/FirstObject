public class Account {

    private double balance;
    private String name;

    private static int count = 0;

    public Account() {
        this.balance = 0;
        this.name = "No One";
        count++;
    }

    public Account(double balance, String name) {
        this.balance = balance;
        this.name = name;
        count++;
    }

    public double withdraw(double withDrawThisMuch) {

        if (this.balance >= withDrawThisMuch && withDrawThisMuch >0){
            double newBalance = this.balance - withDrawThisMuch;
            return newBalance;
        }

        return 0;
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

    public static int getCount() {
        return count;
    }
}

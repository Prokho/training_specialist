


public class BankAccount {


    private Double balance;
    private String owner;



    public void setOwner(String owner) {

        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }


    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    BankAccount(String owner) {
        this.owner = owner;
        this.balance = 0.0;
    }

    BankAccount(String owner, Double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }


    public void deposit(Double summa) {
        if (summa > 0) {

            if (balance == null) {
                balance = 0.0;
            }
            balance += summa;
        }

    }

    public boolean withdraw(Double summa) {
        if (balance == null) {
            balance = 0.0;
        }

        if (summa > 0 && summa <= balance) {
            balance -= summa;
            return true;
        }

        return false;
    }


    public String toStrings() {

        return String.format("Влалелец:" + getOwner() + " Баланс:" + getBalance());

    }


    public static boolean transfer(Double summa, BankAccount source, BankAccount dest) {

        if(source.withdraw(summa)) {
            dest.deposit(summa);
            return true;
        }
        else return false;

    }

}
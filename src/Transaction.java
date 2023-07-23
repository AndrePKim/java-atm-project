import java.util.Date;

public class Transaction {
    private double amount;
    private Date timestamp;
    private String note;
    private Account inAccount;

    public Transaction(double amount, Account inAccount) {
        //set amount and account
        this.amount = amount;
        this.inAccount = inAccount;
        //set empty note and timestamp
        this.note = "";
        this.timestamp = new Date();
    }
    public Transaction(double amount, String note, Account inAccount) {
        //call two-arg constructor
        this(amount, inAccount);
        //set note and timestamp
        this.note = note;
        this.timestamp = new Date();
    }
}

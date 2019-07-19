package training.practice;

import java.io.Serializable;

public class Transaction implements Serializable {
    private double amount;
    private User creator;

    public Transaction(double amount, User creator) {
        if (amount > 0) {
            this.amount = amount;
        }else this.amount=0;
        this.creator = creator;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", creator=" + creator +
                '}';
    }

    public User getCreator() {
        return creator;
    }


}

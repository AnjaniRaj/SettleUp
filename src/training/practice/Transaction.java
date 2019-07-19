package training.practice;

public class Transaction {
    private int amount;
    private User creator;

    public Transaction(int amount, User creator) {
        if (amount > 0) {
            this.amount = amount;
        }else this.amount=0;
        this.creator = creator;
    }

    public int getAmount() {
        return amount;
    }

    public User getCreator() {
        return creator;
    }


}

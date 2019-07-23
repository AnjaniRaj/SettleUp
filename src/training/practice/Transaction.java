package training.practice;

import java.io.Serializable;
import java.math.BigDecimal;

public class Transaction implements Serializable {
    private BigDecimal amount;
    private User creator;

    public Transaction(BigDecimal amount, User creator) {
        if (amount.compareTo(BigDecimal.ZERO)>0) {
            this.amount = amount;
        }else this.amount=BigDecimal.ZERO;
        this.creator = creator;
    }

    public BigDecimal getAmount() {
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

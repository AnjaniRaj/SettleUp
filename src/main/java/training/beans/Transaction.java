package training.beans;

import java.io.Serializable;
import java.math.BigDecimal;

public class Transaction{
    private int id;
    private BigDecimal amount;
    private User creator;
    private int groupId;

    public Transaction(int id, BigDecimal amount, User creator, int groupId) {
        this.id = id;
        this.amount = amount;
        this.creator = creator;
        this.groupId = groupId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

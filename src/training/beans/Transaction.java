package training.beans;

import java.math.BigDecimal;

public class Transaction{
	private int id;
	private int groupId;
    private BigDecimal amount;
    private User creator;
	public Transaction(int id, int groupId, BigDecimal amount, User creator) {
		super();
		this.id = id;
		this.groupId = groupId;
		this.amount = amount;
		this.creator = creator;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public User getCreator() {
		return creator;
	}
	public void setCreator(User creator) {
		this.creator = creator;
	}
}

package training.standards;

import training.beans.Transaction;

import java.util.List;

public interface ITransactionDAO {
    boolean insertTransactions(Transaction transaction);
    List<Transaction> getTransactionsByGroup(int groupId);

}

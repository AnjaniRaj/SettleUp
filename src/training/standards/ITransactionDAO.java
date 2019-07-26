package training.standards;

import training.beans.Transaction;

public interface ITransactionDAO {
	boolean insertTransaction(Transaction transaction);
}

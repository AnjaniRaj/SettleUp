package training.dao;

import training.beans.Transaction;
import training.connections.GetConnection;
import training.standards.ITransactionDAO;

import java.sql.SQLException;
import java.util.List;

public class TransactionDAO implements ITransactionDAO {
    @Override
    public boolean insertTransactions(Transaction transaction) {
        String sql = "insert into groups values (?,?,?,?,?)";
        GetConnection gc = new GetConnection();

        try {

            gc.ps = GetConnection.getMysqlConnection().prepareStatement(sql);
            gc.ps.setInt(1, transaction.getId());
            gc.ps.setInt(2, transaction.getCreator().getId());
            gc.ps.setBigDecimal(3,transaction.getAmount());
            gc.ps.setInt(4,);

            return gc.ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Transaction> getTransactionsByGroup(int groupId) {
        return null;
    }
}

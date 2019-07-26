package training.dao;

import java.sql.SQLException;

import training.beans.Transaction;
import training.connections.GetConnection;
import training.standards.ITransactionDAO;

public class TransactionDAO implements ITransactionDAO {
    @Override
    public boolean insertTransaction(Transaction transaction) {
    	String sql = "insert into transactions values (?,?,?,?)";
        GetConnection gc = new GetConnection();

        try {

            gc.ps = GetConnection.getMysqlConnection().prepareStatement(sql);
            gc.ps.setInt(1, transaction.getId());
            gc.ps.setString(2, user.getName());

            return gc.ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return false;

    }    
}

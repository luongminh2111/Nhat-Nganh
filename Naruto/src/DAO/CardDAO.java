package DAO;
import HomePage.Computer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CardDAO extends DatabaseConnection {
    public static ObservableList<Computer> LoadDataComputer()
    {
        CardDAO connection = new CardDAO();
        Connection connectDB = connection.ConnectionDb();
        ObservableList<Computer> listComputer = FXCollections.observableArrayList();
        try
        {
            PreparedStatement preparedStatement = connectDB.prepareStatement(
                    "SELECT sto.category, sto.cpu, sto.ram, sto.hardware, sto.monitor, sto.graphicscard, sto.cost" +
                    " FROM storages sto, cart WHERE cart.username = '1' and cart.category = sto.category");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next())
            {
                listComputer.add(new Computer(resultSet.getString("category"), resultSet.getString("cpu"), resultSet.getString("category"),
                        resultSet.getString("cpu"),
                        resultSet.getString("ram"),
                        resultSet.getString("hardware"),
                        resultSet.getString("monitor"),
                        resultSet.getString("graphicscard"),
                        resultSet.getInt("cost")));
            }
            resultSet.close();
            preparedStatement.close();
            connectDB.close();
        }

        catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
        return  listComputer;
    }

}

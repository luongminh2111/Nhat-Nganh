package DAO;

import HomePage.Computer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DetailDAO extends DatabaseConnection{
    public DetailDAO()
    {
        super();
    }
    public static ObservableList<Computer> LoadInfComputer() {
        DetailDAO connection = new DetailDAO();
        Connection connectDB = connection.ConnectionDb();
        ObservableList<Computer> listComputer = FXCollections.observableArrayList();
        try {
            PreparedStatement preparedStatement = connectDB.prepareStatement(
                    "SELECT * FROM storages WHERE category = 'Macbook Retina ME865'");
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                listComputer.add(new Computer(resultSet.getString("category"),
                        resultSet.getString("cpu"),
                        resultSet.getString("ram"),
                        resultSet.getString("hardware"),
                        resultSet.getString("monitor"),
                        resultSet.getString("graphicscard"),
                        resultSet.getString("guarantee"),
                        resultSet.getString("description"),
                        resultSet.getInt("cost")));
            }
            resultSet.close();
            preparedStatement.close();
            connectDB.close();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
        return listComputer;
    }
}

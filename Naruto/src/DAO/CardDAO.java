package DAO;

import HomePage.Computer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CardDAO {
    public Connection DatabaseLink;
    public Connection ConnectionDb()
    {
        String DatabaseName="Computer";
        String DatabaseUser="postgres";
        String Databasepass="luongminh";
        String url= "jdbc:postgresql://localhost:5432/" + DatabaseName;
        try
        {
            Class.forName("org.postgresql.Driver");
            DatabaseLink= DriverManager.getConnection(url,DatabaseUser,Databasepass);

        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
        return DatabaseLink;
    }
    public static ObservableList<Computer> LoadDataComputer()
    {
        CardDAO connection = new CardDAO();
        Connection connectDB = connection.ConnectionDb();
        ObservableList<Computer> listComputer = FXCollections.observableArrayList();
        try
        {
            PreparedStatement preparedStatement = connectDB.prepareStatement(
                    "SELECT category, cpu, ram, hardware, monitor, graphicscard, gia FROM storages");
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next())
            {
                listComputer.add(new Computer(resultSet.getString("category"),
                        resultSet.getString("cpu"),
                        resultSet.getString("ram"),
                        resultSet.getString("hardware"),
                        resultSet.getString("monitor"),
                        resultSet.getString("graphicscard"),
                        resultSet.getInt("gia")));
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

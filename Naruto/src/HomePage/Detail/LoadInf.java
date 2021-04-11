package HomePage.Detail;

import DAO.DatabaseConnection;
import DAO.DetailDAO;
import Login.Login;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoadInf {
    @FXML
    private Text nameText;

    @FXML
    private Text cpuText;

    @FXML
    private Text ramText;

    @FXML
    private Text hardwareText;

    @FXML
    private Text monitorText;

    @FXML
    private Text graphicsCardText;

    @FXML
    private Text guaranteeText;

    @FXML
    private Text descrpText;

    @FXML
    private Text costText;

    @FXML
    private Text acount;

    public LoadInf() {
    }

    public void LoadDataDetail( String category) {
        DetailDAO connection = new DetailDAO();
        Connection connectDB = connection.ConnectionDb();
        // can chinh sua
        try {
            String sql = " SELECT * FROM storages WHERE category =?";
            PreparedStatement preparedStatement = connectDB.prepareStatement(sql);
            preparedStatement.setString(1,category);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                nameText.setText(resultSet.getString("category"));
                cpuText.setText(resultSet.getString("cpu"));
                ramText.setText(resultSet.getString("ram"));
                hardwareText.setText(resultSet.getString("hardware"));
                monitorText.setText(resultSet.getString("monitor"));
                graphicsCardText.setText(resultSet.getString("graphicscard"));
                // guaranteeText.setText(resultSet.getString("guarantee"));
                guaranteeText.setText("12 tháng");
                descrpText.setText(resultSet.getString("description"));
                costText.setText(String.valueOf(resultSet.getInt("cost")));
            }

            resultSet.close();
            preparedStatement.close();
            connectDB.close();

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }
    public void AddCart()
    {
        DatabaseConnection connection = new DatabaseConnection();
        Connection connectDB = connection.ConnectionDb();
        String insertCart = "INSERT INTO cart(username,category) values(?,?)";
        try {
            PreparedStatement preparedStatement = connectDB.prepareStatement(insertCart);
            preparedStatement.setString(1, Login.getOboeru());
            preparedStatement.setString(2,nameText.getText());
            preparedStatement.execute();
            acount.setText("Thêm thành công");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

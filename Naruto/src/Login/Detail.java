package Login;

import DAO.DatabaseConnection;
import DAO.DetailDAO;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.text.Text;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Detail{

    public Text cpuId;
    public Text garphicsId;
    public Text ramId;
    public Text hardwareId;
    public Text monitorId;
    public Text guaranteeId;
    public Button addCartButton;
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
    private RadioButton cpt1;

    @FXML
    private RadioButton cpt2;

    @FXML
    private RadioButton cpt3;

    @FXML
    private RadioButton cpt4;

    @FXML
    private RadioButton cpt5;

    @FXML
    private RadioButton cpt7;

    @FXML
    private RadioButton cpt6;

    @FXML
    private RadioButton cpt8;

    @FXML
    private RadioButton cpt9;

    public void DisplayDetail()
    {
        if(cpt1.isSelected()) {
            LoadDataDetail("HP Pavilion 15 i7-1035G1");
        }
        else if (cpt2.isSelected())
        {
            LoadDataDetail("Macbook Retina ME865");
        }
        else if (cpt3.isSelected())
        {
            LoadDataDetail("Thinkpad X1 Carbon");
        }
        else if ((cpt4.isSelected()))
        {
            LoadDataDetail("HP Envy 13");
        }
        else if ((cpt5.isSelected()))
        {
            LoadDataDetail("Dell XPS 13 9310");
        }

        else if ((cpt6.isSelected()))
        {
            LoadDataDetail("Dell Latitude E7490");
        }

        else if ((cpt7.isSelected()))
        {
            LoadDataDetail("Macbook Air MMGF2");
        }

        else if ((cpt8.isSelected()))
        {
            LoadDataDetail("Thinkpad P51");
        }
        else if ((cpt9.isSelected()))
        {
            LoadDataDetail("Hp Elitebook X360");
        }
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
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

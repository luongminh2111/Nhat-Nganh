package Login;

import DAO.DetailDAO;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Detail {

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
    private Text descrpText;

    @FXML
    private Text baoHanhText;

    @FXML
    private Text costText;

    @FXML
    private Button addCartButton;

    public void ViewForm(String data)
    {
       // LoadDataDetail(data);
    }
    public void LoadDataDetail() {
        DetailDAO connection = new DetailDAO();
       Connection connectDB = connection.ConnectionDb();
        // can chinh sua
        try {
            String sql = " SELECT * FROM storages WHERE cpu ='10th Generation Intel® Core™ i7-1065G7 (8 MB Cache, up to 3.90 GHz)'";
            //String sql = " SELECT * FROM storages WHERE cpu =?";
            PreparedStatement preparedStatement = connectDB.prepareStatement(sql);
           // preparedStatement.setString(1,data);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                nameText.setText(resultSet.getString("category"));
                cpuText.setText(resultSet.getString("cpu"));
                ramText.setText(resultSet.getString("ram"));
                hardwareText.setText(resultSet.getString("hardware"));
                monitorText.setText(resultSet.getString("monitor"));
                graphicsCardText.setText(resultSet.getString("graphicscard"));
                baoHanhText.setText(resultSet.getString("baohanh"));
                descrpText.setText(resultSet.getString("description"));
                costText.setText(String.valueOf(resultSet.getInt("gia")));

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
        if(cpuText.getText()!=null)
        {

        }
    }

}

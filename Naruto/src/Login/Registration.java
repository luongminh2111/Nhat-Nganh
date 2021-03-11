package Login;

import DAO.LoginDAO;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Registration {
    @FXML
    public Button submitButton;

    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML
    private TextField nameText;

    @FXML
    private TextField ageText;

    @FXML
    private TextField phoneText;

    @FXML
    private TextField addressText;

    @FXML
    private Button cancelButton;

    @FXML
    private Text acount;

    public void submitButtonOnAction() throws SQLException {
        LoginDAO connectionNow = new LoginDAO();
        Connection connectDB = connectionNow.ConnectionDb();
        if (username.getText().isEmpty() ||
                password.getText().isEmpty() ||
                nameText.getText().isEmpty() ||
                ageText.getText().isEmpty() ||
                phoneText.getText().isEmpty() ||
                addressText.getText().isEmpty()) {
            acount.setText("Bạn chưa nhập đủ thông tin");
        } else {
            String verify1 = " INSERT INTO customer(name, age, phone, address, username, password) values(?,?,?,?,?,?)";
            PreparedStatement preparedStatement1 = connectDB.prepareStatement(verify1);
            try {
                preparedStatement1.setString(1, nameText.getText());
                preparedStatement1.setInt(2, Integer.parseInt(ageText.getText()));
                preparedStatement1.setString(3, phoneText.getText());
                preparedStatement1.setString(4, addressText.getText());
                preparedStatement1.setString(5, username.getText());
                preparedStatement1.setString(6, password.getText());
                preparedStatement1.execute();

            } catch (Exception e) {
                e.printStackTrace();
                e.getCause();
            }
            acount.setText("Bạn đã đăng kí thành công !");
        }
    }
    public void cancelButtionOnAction()
    {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

}
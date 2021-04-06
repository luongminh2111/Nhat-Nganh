package Login;
import DAO.LoginDAO;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.sql.*;

public class Login {
    @FXML
    private Button loginButton;
    @FXML
    private Text loginMessage;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    private static String oboeru;
    public static String getOboeru() {
        return oboeru;
    }
    public void setOboeru(String oboeru) {
        this.oboeru = oboeru;
    }

    public void validateLogin()
    {
        LoginDAO connection = new LoginDAO();
        Connection connectDB = connection.ConnectionDb();
        String login = " SELECT customer.username, customer.password FROM customer WHERE customer.username = '"+ username.getText() +
                "' AND customer.password = '"+ password.getText() + "'";
        setOboeru(username.getText());
       // String insertCart = " INSERT INTO cart(username) values (?)";
        try {
            Statement statement =connectDB.createStatement();
            ResultSet queryResult1 = statement.executeQuery(login);
           // PreparedStatement preparedStatement1 = connectDB.prepareStatement(insertCart);
           // preparedStatement1.setString(1, username.getText());
            while (queryResult1.next())
            {
                if(queryResult1.getInt(1)==1 )
                {
                    loginMessage.setText("dang nhap thanh cong");
                 //   preparedStatement1.execute();
                    HomeForm();
                }
                else
                {
                    loginMessage.setText("Invalid login. Try again!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void Registration()
    {
        RegistrationForm();
    }
    public void RegistrationForm()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/Display/Registration.fxml"));
            Stage registrationStage=new Stage();
            registrationStage.setTitle("Registration");
            registrationStage.setScene(new Scene(root, 400, 600));
            registrationStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void HomeForm()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/Display/HomePage/Home.fxml"));
            Stage homeStage=new Stage();
            homeStage.setTitle("Trang chu");
            homeStage.setScene(new Scene(root, 1280, 700));
            Stage stage = (Stage) loginButton.getScene().getWindow();
            stage.close();
            homeStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
}

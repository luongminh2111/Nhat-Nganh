package HomePage;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.stage.Stage;

public class Home {
    @FXML
    private MenuButton infoMenuButton;

    public void Back()
    {
        LoginPage();
    }
    public void GO()
    {
        DetailForm();
    }

    public void DisplayDetail()
     {
         DetailForm();
     }
    public void DetailForm() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/Display/Detail.fxml"));
            Stage registrationStage = new Stage();
            registrationStage.setTitle("DETAIL");
            registrationStage.setScene(new Scene(root, 400, 650));
            registrationStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void LoginPage() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/Display/Login.fxml"));
            Stage LoginStage = new Stage();
            LoginStage.setTitle("DETAIL");
            LoginStage.setScene(new Scene(root, 1280, 700));
            Stage stage = (Stage) infoMenuButton.getScene().getWindow();
            stage.close();
            LoginStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
}

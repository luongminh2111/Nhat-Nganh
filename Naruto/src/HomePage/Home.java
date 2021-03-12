package HomePage;

import Login.Detail;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Home {
    @FXML
    private MenuButton infoMenuButton;

    @FXML
    private Label abcviews;

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
    public void DisplayCart()
    {
        CartForm();
    }
  /*   public void ViewDetail()
     {
         String data = abcviews.getText().toString();
         Detail detail = new Detail();
         detail.ViewForm(data);
     }*/
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
    public void CartForm() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/Display/HomePage/Cart.fxml"));
            Stage cartStage = new Stage();
            cartStage.setTitle("CART");
            cartStage.setScene(new Scene(root, 1280, 700));
            cartStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
}

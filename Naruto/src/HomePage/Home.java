package HomePage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

public class Home {
    public MenuItem item1;
    @FXML
    private MenuButton infoMenuButton;

    @FXML
    private RadioButton cpt1;

    public void Back()
    {
        LoginPage();
    }
    public void DisplayCart()
    {
        CartForm();
    }
    public void KhuyenMaiForm()
    {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/Display/HomePage/KhuyenMai.fxml"));
            Stage khuyenMaiStage = new Stage();
            khuyenMaiStage.setTitle("Khuyen Mai");
            khuyenMaiStage.setScene(new Scene(root, 1280, 700));
            Stage stage = (Stage) infoMenuButton.getScene().getWindow();
            stage.close();
            khuyenMaiStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void SuaChuaForm()
    {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/Display/HomePage/SuaChua.fxml"));
            Stage suaChuaStage = new Stage();
            suaChuaStage.setTitle("Sua Chua");
            suaChuaStage.setScene(new Scene(root, 1280, 700));
            Stage stage = (Stage) infoMenuButton.getScene().getWindow();
            stage.close();
            suaChuaStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void DetailForm() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/Display/Detail.fxml"));
            Stage detailStage = new Stage();
            detailStage.setTitle("DETAIL");
            detailStage.setScene(new Scene(root, 700, 700));
            detailStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void LoginPage() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/Display/Login.fxml"));
            Stage loginStage = new Stage();
            loginStage.setTitle("TRANG CHU");
            loginStage.setScene(new Scene(root, 1280, 700));
            Stage stage = (Stage) infoMenuButton.getScene().getWindow();
            stage.close();
            loginStage.show();
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
            Stage stage = (Stage) infoMenuButton.getScene().getWindow();
            stage.close();
            cartStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

}

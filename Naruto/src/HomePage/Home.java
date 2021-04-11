package HomePage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class Home {
    public MenuItem item1;
    @FXML
    private MenuButton infoMenuButton;

    public void PromotionForm()
    {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/Display/HomePage/Promotion.fxml"));
            Stage khuyenMaiStage = new Stage();
            khuyenMaiStage.setTitle("Promotion");
            khuyenMaiStage.setScene(new Scene(root, 1280, 700));
            Stage stage = (Stage) infoMenuButton.getScene().getWindow();
            stage.close();
            khuyenMaiStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void RepairForm()
    {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/Display/HomePage/Repair.fxml"));
            Stage suaChuaStage = new Stage();
            suaChuaStage.setTitle("Repair");
            suaChuaStage.setScene(new Scene(root, 1280, 700));
            Stage stage = (Stage) infoMenuButton.getScene().getWindow();
            stage.close();
            suaChuaStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void DetailHomeForm() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/Display/Detail/DetailHome.fxml"));
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
            Parent root = FXMLLoader.load(getClass().getResource("/Display/Login/Login.fxml"));
            Stage loginStage = new Stage();
            loginStage.setTitle("Login");
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
    public void AppleForm() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/Display/Laptop/LaptopApple.fxml"));
            Stage appleStage = new Stage();
            appleStage.setTitle("Laptop Apple");
            appleStage.setScene(new Scene(root, 1280, 700));
            Stage stage = (Stage) infoMenuButton.getScene().getWindow();
            stage.close();
            appleStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void DellForm() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/Display/Laptop/LaptopDell.fxml"));
            Stage dellStage = new Stage();
            dellStage.setTitle("Laptop Dell");
            dellStage.setScene(new Scene(root, 1280, 700));
            Stage stage = (Stage) infoMenuButton.getScene().getWindow();
            stage.close();
            dellStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void HPForm() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/Display/Laptop/LaptopHP.fxml"));
            Stage hpStage = new Stage();
            hpStage.setTitle("Laptop HP");
            hpStage.setScene(new Scene(root, 1280, 700));
            Stage stage = (Stage) infoMenuButton.getScene().getWindow();
            stage.close();
            hpStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void ThinkPadForm() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/Display/Laptop/LaptopThinkPad.fxml"));
            Stage tpStage = new Stage();
            tpStage.setTitle("Laptop ThinkPad");
            tpStage.setScene(new Scene(root, 1280, 700));
            Stage stage = (Stage) infoMenuButton.getScene().getWindow();
            stage.close();
            tpStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void AccessoryForm() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/Display/HomePage/Accessory.fxml"));
            Stage acStage = new Stage();
            acStage.setTitle("Accessory");
            acStage.setScene(new Scene(root, 1280, 700));
            Stage stage = (Stage) infoMenuButton.getScene().getWindow();
            stage.close();
            acStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
}

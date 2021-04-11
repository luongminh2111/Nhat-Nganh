package HomePage.Laptop;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.stage.Stage;

public class LaptopApple{
    @FXML
    private MenuButton infoMenuButton;

    public void DetailAppleForm() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/Display/Detail/DetailApple.fxml"));
            Stage detailAppleStage = new Stage();
            detailAppleStage.setTitle("APPLE");
            detailAppleStage.setScene(new Scene(root, 700, 700));
            detailAppleStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void HomePage() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/Display/HomePage/Home.fxml"));
            Stage homePage = new Stage();
            homePage.setTitle("Home Page");
            homePage.setScene(new Scene(root, 1280, 700));
            Stage stage = (Stage) infoMenuButton.getScene().getWindow();
            stage.close();
            homePage.show();
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
            cartStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void New1() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/Display/WebView/Apple/New1.fxml"));
            Stage newPage = new Stage();
            newPage.setTitle("New");
            newPage.setScene(new Scene(root, 1280, 700));
            newPage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void New2() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/Display/WebView/Apple/New2.fxml"));
            Stage newPage = new Stage();
            newPage.setTitle("New");
            newPage.setScene(new Scene(root, 1280, 700));
            newPage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void New3() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/Display/WebView/Apple/New3.fxml"));
            Stage newPage = new Stage();
            newPage.setTitle("New");
            newPage.setScene(new Scene(root, 1280, 700));
            newPage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
}

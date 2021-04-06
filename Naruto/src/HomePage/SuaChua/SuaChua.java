package HomePage.SuaChua;

import DAO.DatabaseConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class SuaChua implements Initializable {
    @FXML
    private MenuButton infoMenuButton;

    @FXML
    private MenuItem item1;

    @FXML
    private MenuItem item2;

    @FXML
    private TextField nameText;

    @FXML
    private TextField phoneText;

    @FXML
    private TextField timeText;

    @FXML
    private Button sendButton;

    @FXML
    private ComboBox<String> trademarkCbb;

    @FXML
    private ComboBox<String> placeCbb;

    @FXML
    private ComboBox<String> deviceCbb;

    @FXML
    private ComboBox<String> errorCbb;

    @FXML
    private Label solutionText;

    @FXML
    private Text notificationText;

    @FXML
    private Text anounceText;

    ObservableList<String > trademarkList = FXCollections.observableArrayList(
            "DELL","HP","MACBOOK","THINKPAD");
    ObservableList<String > deviceDellList = FXCollections.observableArrayList(
            "DELL latitude","DELL XPS","DELL precision");
    ObservableList<String > deviceHPList = FXCollections.observableArrayList(
            "HP ENVY","HP Pavilion","HP Elitebook","HP ZBOOK");
    ObservableList<String > deviceMacList = FXCollections.observableArrayList(
            "MAC Pro Touchbar","MAC Pro Retina","MAC Air");
    ObservableList<String > deviceThinkPadList = FXCollections.observableArrayList(
            "THINKPAD X1 Carbon","THINKPAD X Series","THINKPAD E Series","THINKPAD Workstation");
    ObservableList<String > errorList = FXCollections.observableArrayList(
            "Win lỗi, hỏng","Màn hình hỏng","Bàn phím hỏng","Vệ sinh máy");
    ObservableList<String > placeList = FXCollections.observableArrayList(
            "Đại học Bách Khoa","Lớp Nhật 122044","Lựa chọn thứ 2","Lựa chọn thứ 3");
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        placeCbb.setItems(placeList);
        trademarkCbb.setItems(trademarkList);
        placeCbb.setItems(placeList);
        errorCbb.setItems(errorList);
    }
    public void setData() {
        trademarkCbb.setItems(trademarkList);
        if (trademarkCbb.getValue().equals("DELL")) {
            deviceCbb.setItems(deviceDellList);
        } else if (trademarkCbb.getValue().equals("HP")) {
            deviceCbb.setItems(deviceHPList);
        } else if (trademarkCbb.getValue().equals("MACBOOK")) {
            deviceCbb.setItems(deviceMacList);
        } else if (trademarkCbb.getValue().equals("THINKPAD")) {
            deviceCbb.setItems(deviceThinkPadList);
        }
    }
    public void Solution() throws SQLException
    {
        DatabaseConnection connectionNow = new DatabaseConnection();
        Connection connectDB = connectionNow.ConnectionDb();
        if (trademarkCbb.getValue()!=null &&
                deviceCbb.getValue()!=null &&
                errorCbb.getValue()!=null) {
            try {
                anounceText.setText("");
                String sql = " SELECT * FROM fixes WHERE category ='"+trademarkCbb.getValue()+"'and errors ='"+errorCbb.getValue()+"'";
                PreparedStatement preparedStatement = connectDB.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    solutionText.setText(resultSet.getString("fixes"));
                }
                resultSet.close();
                preparedStatement.close();
                connectDB.close();

            } catch (Exception e) {
                e.printStackTrace();
                e.getCause();
            }
        }
        else
        {
            anounceText.setText("Vui lòng nhập các thông tin cần thiết");
        }
    }
    public void SendButton()
    {
        if(nameText.getText().isEmpty() || phoneText.getText().isEmpty()
                || timeText.getText().isEmpty() || placeCbb.getValue().isEmpty() ||
        trademarkCbb.getValue().isEmpty() || deviceCbb.getValue().isEmpty() || errorCbb.getValue().isEmpty())
        {
            notificationText.setText("Vui lòng nhập đầy đủ thông tin !");
        }
        else notificationText.setText("Gửi thành công !");
    }
    public void Back()
    {
        LoginPage();
    }
    public void DisplayCart()
    {
        CartForm();
    }
    public void HomePage() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/Display/HomePage/Home.fxml"));
            Stage homePage = new Stage();
            homePage.setTitle("Trang Chu");
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
            Parent root = FXMLLoader.load(getClass().getResource("/Display/Login.fxml"));
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


}

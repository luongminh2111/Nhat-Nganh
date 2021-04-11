package HomePage.Cart;

import DAO.CardDAO;
import HomePage.Computer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Cart implements Initializable {
    @FXML
    private TableView<Computer> tableViews;

    @FXML
    private TableColumn<Computer, String> categoryColumn;

    @FXML
    private TableColumn<Computer, String> cpuColumn;

    @FXML
    private TableColumn<Computer, String> ramColumn;

    @FXML
    private TableColumn<Computer, String> hardwareColumn;

    @FXML
    private TableColumn<Computer, String> monitorColumn;

    @FXML
    private TableColumn<Computer, String> graphicsColumn;

    @FXML
    private TableColumn<Computer, Integer> costColumn;

    @FXML
    private Button backButton;

    ObservableList<Computer> listComputer = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        categoryColumn.setCellValueFactory(new PropertyValueFactory<>("category"));

        cpuColumn.setCellValueFactory(new PropertyValueFactory<>("cpu"));

        ramColumn.setCellValueFactory(new PropertyValueFactory<>("ram"));

        hardwareColumn.setCellValueFactory(new PropertyValueFactory<>("hardware"));

        monitorColumn.setCellValueFactory(new PropertyValueFactory<>("monitor"));

        graphicsColumn.setCellValueFactory(new PropertyValueFactory<>("graphicsCard"));

        costColumn.setCellValueFactory(new PropertyValueFactory<>("cost"));
        listComputer = CardDAO.LoadDataComputer();
        tableViews.setItems(listComputer);

    }
    public void HomePage() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/Display/HomePage/Home.fxml"));
            Stage homePage = new Stage();
            homePage.setTitle("Trang Chu");
            homePage.setScene(new Scene(root, 1280, 700));
            Stage stage = (Stage) backButton.getScene().getWindow();
            stage.close();
            homePage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
}

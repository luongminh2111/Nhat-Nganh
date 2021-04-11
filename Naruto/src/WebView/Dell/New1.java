package WebView.Dell;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class New1 implements Initializable {
    @FXML
    private WebView webView;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        WebEngine webEngine = webView.getEngine();
        webEngine.load("https://trungtran.vn/danh-gia-san-pham/workstation-the-he-moi-dell-precision-5520-hay-dell-xps-9560/");
    }
}

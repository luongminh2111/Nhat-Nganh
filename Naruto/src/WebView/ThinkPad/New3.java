package WebView.ThinkPad;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class New3 implements Initializable {
    @FXML
    private WebView webView;
    private WebEngine webEngine;
    @FXML
    private TextField addressBar;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        webEngine = webView.getEngine();
        webEngine.load("https://trungtran.vn/tin-moi-nhat/danh-gia-thinkpad-w541-laptop-chuyen-do-hoa-n140/");
    }
}

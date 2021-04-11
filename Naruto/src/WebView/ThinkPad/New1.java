package WebView.ThinkPad;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class New1 implements Initializable {
    @FXML
    private WebView webView;
    private WebEngine webEngine;
    @FXML
    private TextField addressBar;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        webEngine = webView.getEngine();
        webEngine.load("https://trungtran.vn/tin-moi-nhat/lenovo-ra-mat-tvc-moi-cho-thinkpad-x1-nano/");
    }
}

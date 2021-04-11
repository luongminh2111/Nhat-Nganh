package WebView.Accessory;

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
        webEngine.load("https://congnghe.tuoitre.vn/facebook-ro-ri-thong-tin-ca-nhan-hon-nua-ti-nguoi-dung-co-ca-mot-so-nuoc-dong-nam-a-20210404065316887.htm");
    }
}

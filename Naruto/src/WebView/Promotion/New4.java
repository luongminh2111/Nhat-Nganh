package WebView.Promotion;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class New4 implements Initializable {
    @FXML
    private WebView webView;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        WebEngine webEngine = webView.getEngine();
        webEngine.load("https://trungtran.vn/tin-moi-nhat/merry-christmas-2020-don-giang-sinh-rinh-qua-tang/");
    }
}

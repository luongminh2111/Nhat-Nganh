package HomePage.Detail;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

public class Apple extends LoadInf{
    @FXML
    private RadioButton cpt1;

    @FXML
    private RadioButton cpt2;

    @FXML
    private RadioButton cpt3;

    @FXML
    private RadioButton cpt4;

    @FXML
    private RadioButton cpt5;

    @FXML
    private RadioButton cpt6;

    public void DisplayAppleDetail() {
        if (cpt1.isSelected()) {
            LoadDataDetail("Macbook Pro Retina 15.4 inch MJLT2");
        } else if (cpt2.isSelected()) {
            LoadDataDetail("Macbook Pro Retina 15 inch 2014 MGXC2 i7");
        } else if (cpt3.isSelected()) {
            LoadDataDetail("Macbook Pro Retina 13 inch 2015 MF843 i7");
        } else if ((cpt4.isSelected())) {
            LoadDataDetail("MacBook Pro Retina 13 inch 2017 MPXT2 i5");
        } else if ((cpt5.isSelected())) {
            LoadDataDetail("Macbook Retina 13 inch ME865 i5");
        } else if ((cpt6.isSelected())) {
            LoadDataDetail("Macbook Pro TouchBar 13 inch 2017 MPXV2");
        }
    }
}

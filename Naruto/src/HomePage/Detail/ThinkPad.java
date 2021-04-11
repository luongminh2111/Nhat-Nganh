package HomePage.Detail;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;

public class ThinkPad extends LoadInf{
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

    public void DisplayDetailTP() {
        if (cpt1.isSelected()) {
            LoadDataDetail("ThinkPad P50 i7");
        } else if (cpt2.isSelected()) {
            LoadDataDetail("Lenovo Thinkpad X1 Nano");
        } else if (cpt3.isSelected()) {
            LoadDataDetail("Lenovo Legion 5 2020/ Ryzen");
        } else if ((cpt4.isSelected())) {
            LoadDataDetail("Lenovo Thinkpad X390");
        } else if ((cpt5.isSelected())) {
            LoadDataDetail("Lenovo Thinkpad T470s");
        } else if ((cpt6.isSelected())) {
            LoadDataDetail("ThinkPad T460s i7");
        }
    }
}

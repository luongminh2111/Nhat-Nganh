package HomePage.Detail;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;

public class HP extends LoadInf{
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

    public void DisplayDetailHP() {
        if (cpt1.isSelected()) {
            LoadDataDetail("HP ZBook 17 G2 i7");
        } else if (cpt2.isSelected()) {
            LoadDataDetail("HP Envy 13 X360");
        } else if (cpt3.isSelected()) {
            LoadDataDetail("HP Pavilion 13 I3");
        } else if ((cpt4.isSelected())) {
            LoadDataDetail("HP ZBook 15 G5 Xeon");
        } else if ((cpt5.isSelected())) {
            LoadDataDetail("HP Pavilion 15 i5");
        } else if ((cpt6.isSelected())) {
            LoadDataDetail("HP Elitebook 820 G3");
        }
    }
}

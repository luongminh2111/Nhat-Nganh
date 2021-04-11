package HomePage.Detail;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;

public class Dell extends LoadInf {
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

    public void DisplayDetailDELL() {
        if (cpt1.isSelected()) {
            LoadDataDetail("Dell Latitude E7280");
        } else if (cpt2.isSelected()) {
            LoadDataDetail("Dell XPS 13 9310");
        } else if (cpt3.isSelected()) {
            LoadDataDetail("Dell Precision 3510 i7");
        } else if ((cpt4.isSelected())) {
            LoadDataDetail("Dell Latitude E6540 i5 4200M");
        } else if ((cpt5.isSelected())) {
            LoadDataDetail("Dell Inspiron G5 5590");
        } else if ((cpt6.isSelected())) {
            LoadDataDetail("Dell XPS 15 9570");
        }
    }
}

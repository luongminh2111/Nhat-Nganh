module Naruto {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
    requires java.sql;
    opens sample;
    opens Login;
    opens Display;
    opens DAO;
    opens Display.image.home;
    opens Display.image.login;
    opens HomePage;
    opens HomePage.Laptop;
    opens HomePage.PhuKien;

}
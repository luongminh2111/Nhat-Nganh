module Naruto {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
    requires java.sql;
    requires org.postgresql.jdbc;
    opens sample;
    opens Login;
    opens Display;
    opens DAO;
    opens Display.image.home;
    opens Display.HomePage;
    opens HomePage;
    opens HomePage.Laptop;
    opens HomePage.PhuKien;
    opens HomePage.KhuyenMai;
    opens HomePage.SuaChua;
}
module Naruto {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
    requires java.sql;
    requires org.postgresql.jdbc;
    requires javafx.web;
    opens sample;
    opens Login;
    opens DAO;
    opens Display.image.home;
    opens Display.HomePage;
    opens Display.WebView.Apple;
    opens Display.WebView.HP;
    opens Display.WebView.ThinkPad;
    opens Display.WebView.Dell;
    opens Display.WebView.Accessory;
    opens Display.WebView.Promotion;
    opens Display.Login;

    opens HomePage;
    opens HomePage.Laptop;
    opens HomePage.Accessory;
    opens HomePage.Promotion;
    opens HomePage.Repair;
    opens HomePage.Detail;
    opens HomePage.Cart;

    opens WebView.Apple;
    opens WebView.HP;
    opens WebView.ThinkPad;
    opens WebView.Dell;
    opens WebView.Accessory;
    opens WebView.Promotion;

}
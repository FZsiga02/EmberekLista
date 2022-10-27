package com.example.embereklista;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class EmberController {
    @FXML
    private TableView<Ember> ember;
    @FXML
    private TableColumn<Ember, String> nevOszlop;
    @FXML
    private TableColumn<Ember, Integer> korOszlop;
    @FXML
    private TextField nevMezo;
    @FXML
    private Spinner korMezo;

    @FXML
    private void initialize() {
        nevOszlop.setCellValueFactory(new PropertyValueFactory<>("nev"));
        korOszlop.setCellValueFactory(new PropertyValueFactory<>("eletkor"));
        Ember e1 = new Ember("Gipsz Jakab", 25);
        Ember e2 = new Ember("Teszt Elek", 42);
        Ember e3 = new Ember("Lakatos Brandon Károly", 17);
        ember.getItems().add(e1);
        ember.getItems().add(e2);
        ember.getItems().add(e3);
    }

    public void hozzaadClick(ActionEvent actionEvent) {
        Ember e = new Ember(nevMezo.getText(), (int)korMezo.getValue());
        ember.getItems().add(e);
    }
}
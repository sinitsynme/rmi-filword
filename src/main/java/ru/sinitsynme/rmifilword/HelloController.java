package ru.sinitsynme.rmifilword;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.List;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TableView<String[][]> tableView;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

}
package lk.ijse.javafx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class MainFormController {

    public Button rootNodeItem;

    public void btnCustomerOnAction(ActionEvent actionEvent) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/customer_form.fxml"));

        Scene scene = new Scene(rootNode);
        Stage stage = new Stage();
        stage.setScene(scene);

        stage.show();
    }

    public void btnExitOnAction(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void btnItemOnAction(ActionEvent actionEvent) throws IOException {

        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/item_form.fxml"));
        Scene scene = new Scene(rootNode);

        Stage primaryStage = (Stage) this.rootNodeItem.getScene().getWindow();
        primaryStage.setScene(scene);

    }
}

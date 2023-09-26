package lk.ijse.javafx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.javafx.LauncherWrapper;
import lk.ijse.javafx.db.db;

import java.io.IOException;

public class LoginFormController {

    public TextField txtUserName;
    public PasswordField txtPassword;
    public AnchorPane rootNodeLogin;

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {

        String uName = txtUserName.getText();
        String pw = txtPassword.getText();

        if (db.userNamae.equals(uName) && db.pw.equals(pw)) {
            Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/main_form.fxml"));
            Scene scene = new Scene(rootNode);

            Stage primaryStage = (Stage) this.rootNodeLogin.getScene().getWindow();
            primaryStage.setScene(scene);
            primaryStage.centerOnScreen();

        } else {
            System.exit(0);
        }
    }

    public void btnForgetPasswordOnAction(ActionEvent actionEvent) {

    }
}

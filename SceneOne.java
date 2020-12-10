package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneOne {

    @FXML
    private TextField email;

    public void register(ActionEvent actionEvent) throws IOException {
        Students.getInstance().getEmails().add(email.getText());
        nextScene(actionEvent);
    }

    private void nextScene(ActionEvent actionEvent) throws IOException {
        Parent p = FXMLLoader.load(getClass().getResource("sceneTwo.fxml"));
        Scene newScene = new Scene(p);

        Stage stage= (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(newScene);
        stage.show();
    }

    public void seeEmails(ActionEvent actionEvent) throws IOException {
        nextScene(actionEvent);
    }
}

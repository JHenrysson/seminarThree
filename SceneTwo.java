package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneTwo {

    @FXML
    private ListView<String> list;
    public void initialize(){
    list.getItems().addAll(Students.getInstance().getEmails());
}

    public void removeEmail(ActionEvent actionEvent) {
        list.getItems().remove( list.getSelectionModel().getSelectedIndex());
    }

    public void addEmail(ActionEvent actionEvent) throws IOException {
        Parent p = FXMLLoader.load(getClass().getResource("sceneOne.fxml"));
        Scene newScene = new Scene(p);

        Stage stage= (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(newScene);
        stage.show();
    }
}

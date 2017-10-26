package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sun.security.timestamp.TSRequest;

import java.io.IOException;
import java.util.stream.IntStream;

/**
 * Created by Jakub Kowalski on 21.10.2017.
 */
public class KategoriaA {
    public Button wrocDoStronyGlownej;
    @FXML
    public Button Tak;
    @FXML
    public Button A;

    private static Integer i = 0;

    public void goToNextQuestion() throws IOException {
        Stage stage;
        Parent root;

        System.out.println(i);
        stage = (Stage) Tak.getScene().getWindow();
        //load up OTHER FXML document
        if(i>=5)
        {
            root = FXMLLoader.load(getClass().getResource("KategoriaA.fxml"));
            i++;
        } else
        {
            root = FXMLLoader.load(getClass().getResource("KategoriaATakNie.fxml"));
            i++;
        }

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void goToFinalScene() throws IOException {
        Stage stage;
        Parent root;

        System.out.println(i);
        stage = (Stage) A.getScene().getWindow();
        //load up OTHER FXML document
        if(i>=10)
        {
            root = FXMLLoader.load(getClass().getResource("FinalScene.fxml"));
            i++;
        } else
        {
            root = FXMLLoader.load(getClass().getResource("KategoriaA.fxml"));
            i++;
        }

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void backToMain() throws IOException {
        Stage stage;
        Parent root;
        //get reference to the button's stage
        stage = (Stage) wrocDoStronyGlownej.getScene().getWindow();
        //load up OTHER FXML document
        root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        //create a new scene with root and set the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

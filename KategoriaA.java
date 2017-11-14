package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import sun.security.timestamp.TSRequest;

import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author Jakub Kowalski
 */
public class KategoriaA {


    public Text question;
    @FXML
    public Button wrocDoStronyGlownej;
    @FXML
    public Button Tak;
    @FXML
    public Button Nie;
    @FXML
    public Button A;
    @FXML
    public Button B;
    @FXML
    public Button C;
    DropShadow shadow = new DropShadow();

    private static Integer i = 0;


    public KategoriaA() throws FileNotFoundException {
    }

    public void goToNextQuestion() throws IOException {
        Stage stage;
        Parent root;

        stage = (Stage) Tak.getScene().getWindow();

        //load up OTHER FXML document
        if (i >= 5) {
            root = FXMLLoader.load(getClass().getResource("KategoriaA.fxml"));
            i++;
        } else {
            root = FXMLLoader.load(getClass().getResource("KategoriaATakNie.fxml"));
            i++;
        }

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }// just go to next question(future need to store the answers and sum up also need to random choose questions form poul)

    public void goToFinalScene() throws IOException {
        Stage stage;
        Parent root;

        System.out.println(i);
        stage = (Stage) A.getScene().getWindow();

        if (i >= 10) {
            root = FXMLLoader.load(getClass().getResource("FinalScene.fxml"));
            i++;
        } else {
            root = FXMLLoader.load(getClass().getResource("KategoriaA.fxml"));
            i++;
        }

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }// this function making when program is going to be ended (future need to sum up all points)

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
        i = i - 5;

    }// go back to main scene


    public void setShadowBack() {
        wrocDoStronyGlownej.setEffect(shadow);
    }

    public void setNotShadowBack() {
        wrocDoStronyGlownej.setEffect(null);
    }

    public void setShadowAAnswer() {
        A.setEffect(shadow);
    }

    public void setNotShadowAAnswer() {
        A.setEffect(null);
    }

    public void setShadowBAnswer() {
        B.setEffect(shadow);
    }

    public void setNotShadowBAnswer() {
        B.setEffect(null);
    }

    public void setShadowCAnswer() {
        C.setEffect(shadow);
    }

    public void setNotShadowCAnswer() {
        C.setEffect(null);
    }

    public void setShadowTak() {
        Tak.setEffect(shadow);
    }

    public void setNotShadowTak() {
        Tak.setEffect(null);
    }

    public void setShadowNie() {
        Nie.setEffect(shadow);
    }

    public void setNotShadowNie() {
        Nie.setEffect(null);
    }

}
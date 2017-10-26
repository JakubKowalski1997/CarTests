package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class Controller extends Main{
public Button katA;
public Button katB;
public Button katC;
public Button katD;
public Button katT;
    DropShadow shadow = new DropShadow();


    public void handleButtonClickA() throws IOException {
        Stage stage;
        Parent root;
            stage = (Stage) katA.getScene().getWindow();
            //load up OTHER FXML document
            root = FXMLLoader.load(getClass().getResource("KategoriaATakNie.fxml"));
            //create a new scene with root and set the stage
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
    }

    public void setShadowA()
    {
        katA.setEffect(shadow);
    }public void setNotShadowA()
    {
        katA.setEffect(null);
    }

    public void setShadowB()
    {
        katB.setEffect(shadow);
    }

public void setNotShadowB()
{
    katB.setEffect(null);
}

    public void setShadowC()
    {
        katC.setEffect(shadow);
    }

public void setNotShadowC()
        {
        katC.setEffect(null);
        }
    public void setShadowD()
    {
        katD.setEffect(shadow);
    }

    public void setNotShadowD()
    {
        katD.setEffect(null);
    }

    public void setShadowT()
    {
        katT.setEffect(shadow);
    }

    public void setNotShadowT()
    {
        katT.setEffect(null);
    }


    /*public void handleButtonClickB(ActionEvent event) throws IOException {
        Parent katA = FXMLLoader.load(getClass().getResource("KategoriaB.fxml"));
        Scene katAScene = new Scene(katA);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(katAScene);
        window.show();
    }

    public void handleButtonClickC(ActionEvent event) throws IOException {
        Parent katA = FXMLLoader.load(getClass().getResource("KategoriaC.fxml"));
        Scene katAScene = new Scene(katA);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(katAScene);
        window.show();
    }

    public void handleButtonClickD(ActionEvent event) throws IOException {
        Parent katA = FXMLLoader.load(getClass().getResource("KategoriaD.fxml"));
        Scene katAScene = new Scene(katA);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(katAScene);
        window.show();
    }


    public void handleButtonClickT(ActionEvent event) throws IOException {
        Parent katA = FXMLLoader.load(getClass().getResource("KategoriaT.fxml"));
        Scene katAScene = new Scene(katA);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(katAScene);
        window.show();
    }
*/
}


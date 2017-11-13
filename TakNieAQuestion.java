package sample;

import javafx.scene.text.Text;

import java.io.*;
import java.util.ArrayList;


public class TakNieAQuestion extends Text {

    Question questionTakNie = new Question();

    public TakNieAQuestion() throws FileNotFoundException {
        this.setText(questionTakNie.getQuestion());
        System.out.println(questionTakNie.getQuestion());
    }

}

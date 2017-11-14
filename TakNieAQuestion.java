package sample;

import javafx.scene.text.Text;

import java.io.FileNotFoundException;
import java.io.IOException;


public class TakNieAQuestion extends Text {


    private Question questionTakNie = new Question();

    public TakNieAQuestion() throws IOException {
        this.setText(questionTakNie.getQuestion());
    }
}

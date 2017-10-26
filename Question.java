package sample;

import javafx.scene.image.*;
import javafx.scene.media.VideoTrack;


/**
 * Created by Jakub Kowalski on 20.10.2017.
 */
public class Question {
    private String question;
    private String answer;
    private Image image;
    private VideoTrack video;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public Question(String question, String answer, Image image) {
        this.question = question;
        this.answer = answer;
        this.image = image;
    }

    public Question(String question, String answer, VideoTrack video) {
        this.question = question;
        this.answer = answer;
        this.video = video;
    }
}

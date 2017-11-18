package sample;

import com.sun.org.apache.xpath.internal.SourceTree;
import javafx.scene.image.*;
import javafx.scene.media.VideoTrack;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.*;


/**
 * Created by Jakub Kowalski on 20.10.2017.
 */
public class Question {
    private String question;
    private String answer;
    private Image image;
    private VideoTrack video;


    public Question() throws IOException {
           this.question = quest();
    }

    public String getQuestion() {
        return this.question;
    }

    public String getAnswer() {
        return answer;
    }

    public Image getImage() {
        return image;
    }

    public VideoTrack getVideo() {
        return video;
    }

    FileReader fs = new FileReader("PytaniaA/TakNieA.txt");
    BufferedReader br = new BufferedReader(fs);
    ArrayList<String> array = new ArrayList<>();
    String line;
    private ArrayList makeListOfQuestions() throws IOException {

            while ((line = br.readLine()) != null)
                array.add(line);

        System.out.println(array);
        return array;
    }

    Random generator = new Random();
    int randomIndex = generator.nextInt(makeListOfQuestions().size());

    private String randomQuestionTakNieA(String questionOrAnswer) throws IOException {
        String lineTxt = (String) makeListOfQuestions().get(randomIndex);
        String q = lineTxt.substring(0, lineTxt.indexOf("::"));

        String a = lineTxt.substring(lineTxt.lastIndexOf("::") + 2);
        if (questionOrAnswer == "question") {
            return q;
        } else if (questionOrAnswer == "answer") {
            return a;
        }

        return "";
    }

    private String quest() throws IOException {
        String q = randomQuestionTakNieA("question");
        return q;
    }

}




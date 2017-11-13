package sample;

import javafx.scene.image.*;
import javafx.scene.media.VideoTrack;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;


/**
 * Created by Jakub Kowalski on 20.10.2017.
 */
public class Question {
    private String question;
    private String answer;
    private Image image;
    private VideoTrack video;

    public Question() throws FileNotFoundException {
        if (randomQuestionTakNieA("question") != null) {
            this.question = randomQuestionTakNieA("question");
        }
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void setVideo(VideoTrack video) {
        this.video = video;
    }

    public String getQuestion() {

        return question;
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

    private static int countLines(File input) throws IOException {
        try (InputStream is = new FileInputStream(input)) {
            int count = 1;
            for (int aChar = 0; aChar != -1; aChar = is.read())
                count += aChar == '\n' ? 1 : 0;
            return count;
        }
    } //Liczymy ilość lini w pliku

    File fileTakNieA = new File("PytaniaA/TakNieA.txt");
    Scanner inFileTakNieA = new Scanner(fileTakNieA);
    BufferedReader reader;
    Random generator = new Random(System.currentTimeMillis());

    public String randomQuestionTakNieA(String questionOrAnswer) throws FileNotFoundException {
        try {
            reader = new BufferedReader(new FileReader(
                    "PytaniaA/TakNieA.txt"));
            String line = reader.readLine();
            int i = 0;
            System.out.println(countLines(fileTakNieA) - 1);

            while (line != null) {

                if (i == generator.nextInt(countLines(fileTakNieA) - 1)) {
                    //System.out.println(line.substring(line.lastIndexOf("::") + 2));

                    // line.substring(0,line.indexOf("::"));
                    String q = line.substring(0, line.indexOf("::"));
                    String a = line.substring(line.lastIndexOf("::") + 2);
                    if (questionOrAnswer == "question") {
                        return q;
                    } else if (questionOrAnswer == "answer") {
                        return a;
                    }

                } else
                    i++;
                // read next line
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }//Losujemy pytanie


    // POPRACOWAC NAD TYM PONIZEJ
    void losuj() throws FileNotFoundException {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < 1000; ++i) {
            String s = choose(new File("PytaniaA/TakNieA.txt"));
            if (!map.containsKey(s))
                map.put(s, 0);
            map.put(s, map.get(s) + 1);
        }

        System.out.println(map);
    }

    public static String choose(File f) throws FileNotFoundException {
        String result = null;
        Random rand = new Random();
        int n = 0;
        for (Scanner sc = new Scanner(f); sc.hasNext(); ) {
            ++n;
            String line = sc.nextLine();
            if (rand.nextInt(n) == 0)
                result = line;
        }

        return result;
    }

}




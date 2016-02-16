package ie.tcd.cs3102;

import java.util.Arrays;
/**
 * Created by brian on 09/02/2016.
 */
public class MultipleChoiceQuestion extends Question {
    String[] choices;

    MultipleChoiceQuestion(String title, String[] choices) {
        super(title);
        this.choices = choices;
    }

    @Override
    public String getText() {
        return Arrays.toString(choices);
    }

    public void submit(String answer) {

    }
}

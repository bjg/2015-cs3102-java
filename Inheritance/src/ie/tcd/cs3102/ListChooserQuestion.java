package ie.tcd.cs3102;

import java.util.Arrays;

/**
 * Created by brian on 09/02/2016.
 */
public class ListChooserQuestion extends Question {
    String[] list;

    ListChooserQuestion(String title, String[] list) {
        super(title);
        this.list = list;
    }

    public String getText() {
        return Arrays.toString(list);
    }

    public void submit(String[] answers) {

    }
}

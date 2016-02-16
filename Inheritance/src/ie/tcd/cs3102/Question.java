package ie.tcd.cs3102;

/**
 * Created by brian on 09/02/2016.
 */
public abstract class Question {
    protected String title;

    public Question() {}

    public Question(String title) {
        this.title = title;
    }
    public abstract String getText();

    public String getTitle() {
        return title;
    }
}

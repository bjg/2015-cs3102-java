package ie.tcd.cs3102;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MultipleChoiceQuestion mcq =
            new MultipleChoiceQuestion("What is Java?", new String[] {
                "one",
                "two",
                "three"
            });

        Question q = new Question("Some title") {
            @Override
            public String getText() {
                return "Some text";
            }
        };

        System.out.println(q.getTitle() + " " + q.getText());

        System.out.println(mcq.getTitle() + " " + mcq.getText());
    }
}

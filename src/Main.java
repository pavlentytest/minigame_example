import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        // Car.Wheel wheel = new Car.Wheel();
        //   System.out.println("Hello world!");
        toDo();
    }
    public static void toDo() throws Exception {
        throw new Exception();
    }
}
class Answer {
    private String value;
    private boolean correct;

    public Answer(String value, boolean correct) {
        this.value = value;
        this.correct = correct;
    }
}
class Question {
    private String title;
    private ArrayList<Answer> answers;

    public Question(String title, ArrayList<Answer> answers) {
        this.title = title;
        this.answers = answers;
    }
}
class Game {
    private String name;
    private ArrayList<Question> questions;

    public Game(String name, ArrayList<Question> questions) {
        this.name = name;
        this.questions = questions;
    }
}
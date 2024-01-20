import org.QuizApp.QuestionsService.quizService;

public class Main {
    public static void main(String[] args) {

        quizService qs = new quizService();
        qs.PlayQuiz();
        qs.printScore();
    }
}
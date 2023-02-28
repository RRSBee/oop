package quiz;

public class ThisThatQuestion extends MultipleChoiceQuestion{

    // For these questions, answers are not labeled, but formatted as text.

    public ThisThatQuestion(String question, String[] answers, int correctAnswer, int score) {
        super(question, answers, correctAnswer, score);
    }

    public ThisThatQuestion(String question, String[] answers, int correctAnswer) {
        super(question, answers, correctAnswer);
    }
    
}

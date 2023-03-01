package quiz;
/*
     * An open question is a question that expects a string as an answer.
      This means that a good question from this category only has one correct answer.
     */

public class OpenQuestions extends Questions {
    private String answer;
    private String question;

    public OpenQuestions (String question , String answer , int score) {
        super(score);
        this.answer = answer;
    }
    
    public OpenQuestions (String question , String answer) {
        this(question, answer, 3);
    }

    @Override
    public String toString() {
        return "Question: " + question;
    }

    @Override
    public boolean isCorrect(String answer) {
        return this.answer.equalsIgnoreCase(answer);
    }

    @Override
    public String correctAnswer() {
        return answer;
    }

}

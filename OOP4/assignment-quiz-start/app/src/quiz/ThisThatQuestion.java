// Made by Raveena Boedhram s1074078 
// Quint van Oorschot s1098812

package quiz;

import java.util.List;

public class ThisThatQuestion extends MultipleChoiceQuestion{
    private String answer;
    private String question;
    private List<Question> questions;
    private int round;
    private Question q;
    private List<Question> wrongQuestions;
    private String userAnswer;
    private List<Question> wrongQuestions2;
    
    // For these questions, answers are not labeled, but formatted as text.

    public ThisThatQuestion(String question, String[] answers, int correctAnswer, int score) {
        super(question, answers, correctAnswer, score);
    }
    

    public ThisThatQuestion(String question, String[] answers, int correctAnswer) {
        super(question, answers, correctAnswer);
    }

    public String totalScore(){
        int scoreRound1 = questions.stream().mapToInt(Question::getScore).sum();
        int scoreRound2 = wrongQuestions.stream().mapToInt(Question::getScore).sum() 
            + wrongQuestions2.stream().mapToInt(Question::getScore).sum();
        return "Round 1 Score: " + scoreRound1 + "Round 2 Score: " + scoreRound2;
        
    }
    
}

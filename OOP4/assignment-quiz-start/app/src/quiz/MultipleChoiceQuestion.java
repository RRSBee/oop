// Made by Raveena Boedhram s1074078 
// Quint van Oorschot s1098812

package quiz;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MultipleChoiceQuestion extends Question {
    private String answer;
    private String question;
    private List<Question> questions;
    private int round;
    private Question q;
    private List<Question> wrongQuestions;
    private String userAnswer;
    private List<Question> wrongQuestions2;



    /**
     * This one is used in round 2
     * 
     * @param question
     * @param answers       all possible answers from the toString function.
     * @param correctAnswer is the index of the correct answer in the array of
     *                      answers.
     * @param score         score on the question
     */
    public MultipleChoiceQuestion(String question, String[] answers, int correctAnswer, int score) {
        super(score); 
        round = 1;


    }

    /**
     * @param question
     * @param answers       all possible answers from the toString function.
     * @param correctAnswer is the index of the correct answer in the array of
     *                      answers.
     */
    public MultipleChoiceQuestion(String question, String[] answers, int correctAnswer) {
        super(correctAnswer); // just to get rid of error message
        
        round = 2;
        
    }



    @Override
    public String toString(int i, Question q) {
        // The toString function should print all possible answers, preceded by a), b),
        // c), and so on.
        // The correct answer for a multiple choice question is the letter of the
        // respective answer.
        throw new UnsupportedOperationException("Unimplemented method 'toString'");
    }

    @Override
    public boolean isCorrect(String answer) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isCorrect'");
    }

    @Override
    public String correctAnswer() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'correctAnswer'");
    }


    public String totalScore(){
        int scoreRound1 = questions.stream().mapToInt(Question::getScore).sum();
        int scoreRound2 = wrongQuestions.stream().mapToInt(Question::getScore).sum() 
            + wrongQuestions2.stream().mapToInt(Question::getScore).sum();
        return "Round 1 Score: " + scoreRound1 + "Round 2 Score: " + scoreRound2;
        
    }

   

}

// Made by Raveena Boedhram s1074078 
// Quint van Oorschot s1098812

package quiz;
/*
     * An open question is a question that expects a string as an answer.
      This means that a good question from this category only has one correct answer.
     */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class OpenQuestion extends Question {
    private String answer, question, userAnswer;
    private List<Question> questions = new ArrayList<>();
    private List<Question> wrongQuestions = new ArrayList<>();
    private List<Question> wrongQuestions2 = new ArrayList<>();
    private int round;

    public OpenQuestion(String _question, String _answer, int _score) { // In case of score defined
        super(_score);
    
        question = _question;
        answer = _answer;

        System.out.println(question);
        Scanner scanner = new Scanner(System.in);
        userAnswer = scanner.nextLine();
        if (isCorrect(answer)) {
            System.out.println("Correct! You scored " + getScore() + " point(s)."); 
        } else {
            System.out.println("Incorrect! The correct answer is: " + correctAnswer());
            setScore(0);
        }
        scanner.close();

    }

    public OpenQuestion(String question, String answer) { // In case of no score defined
        this(question, answer, 3);
        System.out.println("THIS FUNCTION IS BROKEN. COPY FROM OTHER OPEN QUESTION CONSTRUCTOR");
        for (int i = 0; i < wrongQuestions.size(); i++) {
            Question q = questions.get(i);
            toString(i, q);
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.nextLine();
            if (q.isCorrect(answer)) { 
                System.out.println("Correct! You scored " + q.getScore() + "point(s)."); 
            } 
            else {
                 System.out.println("Incorrect! The correct answer is: " + q.correctAnswer());
                 q.setScore(0);
                 wrongQuestions2.add(q);
            }
            scanner.close();
            System.out.println(totalScore());
        }
    }

    @Override
    public String toString(int i, Question q) {
        return "Round " + round + "Question: " + i + ": " + q;
    }

    @Override
    public boolean isCorrect(String answer) {
        return this.answer.equalsIgnoreCase(userAnswer);
    }

    @Override
    public String correctAnswer() {
        return answer;
    }

    
    public String totalScore(){
        int scoreRound1 = questions.stream().mapToInt(Question::getScore).sum();
        int scoreRound2 = wrongQuestions.stream().mapToInt(Question::getScore).sum() 
            + wrongQuestions2.stream().mapToInt(Question::getScore).sum();
        return "Round 1 Score: " + scoreRound1 + "Round 2 Score: " + scoreRound2;
        
    }
}

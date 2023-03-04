// Made by Raveena Boedhram s1074078 
// Quint van Oorschot s1098812

package quiz;
/*
     * An open question is a question that expects a string as an answer.
      This means that a good question from this category only has one correct answer.
     */

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class OpenQuestion extends Question {
    private String answer;
    private String question;
    private List<Question> questions;
    private int round;
    private Question q;
    private List<Question> wrongQuestions;
    private String userAnswer;
    private List<Question> wrongQuestions2;

    public OpenQuestion(String question, String answer, int score) { // first round
        questions = new LinkedList<>();
        wrongQuestions = new LinkedList<>();
        int round = 1;
    
       for (int i = 0; i < questions.size(); i++) {
        Question q = questions.get(i);
        toString(i, q);
        Scanner scanner = new Scanner(System.in)
        String userAnswer = scanner.nextLine();
            if (q.isCorrect(answer)){
            System.out.println("Correct! You scored " + q.getScore() + "point(s)."); 
            } else {
                System.out.println("Incorrect! The correct answer is: " + q.correctAnswer());
                q.setScore(0);
                wrongQuestions.add(q);
                }
    
        }
    }

    public OpenQuestion(String question, String answer) { // second round
        this(question, answer, 3);
        int round = 2;

        for (int i = 0; i < wrongQuestions.size(); i++) {
            Question q = questions.get(i);
            toString(i, q);
            Scanner scanner = new Scanner(System.in)
            String userAnswer = scanner.nextLine();
            if (q.isCorrect(answer)) { 
                System.out.println("Correct! You scored " + q.getScore() + "point(s)."); 
            } 
            else {
                 System.out.println("Incorrect! The correct answer is: " + q.correctAnswer());
                 q.setScore(0);
                 wrongQuestions2.add(q);
            }
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

    @Override
    public void addQuestions() {
        questions.add(new OpenQuestion("What is the capital of France?", "Paris", 3));
        questions.add(new OpenQuestion("How many roads must a man walkdown?", "42", 5));
        questions.add(new OpenQuestion("What is the big O complexity of binary search?", "O(log N)"));
        questions.add(
                new OpenQuestion("How would you read an integer i from scanner s in Java?", "i = s.nextInt();", 2));
        questions.add(new OpenQuestion(
                "What is the minimum amount of constructors you have to define for a class in Java?", "0", 2));
        throw new UnsupportedOperationException("Unimplemented method 'addQuestions'");
    }

    public String totalScore(){
        int scoreRound1 = questions.stream().mapToInt(Question::getScore).sum();
        int scoreRound2 = wrongQuestions.stream().mapToInt(Question::getScore).sum() 
            + wrongQuestions2.stream().mapToInt(Question::getScore).sum();
        return "Round 1 Score: " + scoreRound1 + "Round 2 Score: " + scoreRound2;
        
    }
}

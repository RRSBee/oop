// Made by Raveena Boedhram s1074078 
// Quint van Oorschot s1098812

package quiz;
import java.util.List;

public class ThisThatQuestionData {

    private String question;
    private String answer1, answer2;
    private int correctAnswer, score;
    private boolean hasScore;

    ThisThatQuestionData (String _question, String _answer1, String _answer2, int _correctAnswer, int _score) {
        question = _question;
        answer1 =  _answer1;
        answer2 = _answer2;
        correctAnswer = _correctAnswer;
        score = _score;
        hasScore = true;
    }
    ThisThatQuestionData (String _question, String _answer1, String _answer2, int _correctAnswer) {
        question = _question;
        answer1 =  _answer1;
        answer2 = _answer2;
        correctAnswer = _correctAnswer;
        hasScore = false;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        if (correctAnswer == 0){
            return answer1;
        } else return answer2;
    }
        

    public int getScore() {
        if (!hasScore) {
            System.out.println("[!] Question does not have a score!");
            return -1;
        }
        return score;
    }
}
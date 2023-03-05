// Made by Raveena Boedhram s1074078 
// Quint van Oorschot s1098812

package quiz;

import java.util.List;

public class OpenQuestionData {
    private String question, answer;
    private int score;
    private boolean hasScore;

    OpenQuestionData (String _question, String _answer, int _score) {
        question = _question;
        answer = _answer;
        score = _score;
        hasScore = true;
    }
    OpenQuestionData (String _question, String _answer) {
        question = _question;
        answer = _answer;
        hasScore = false;
    }

    public String getQuestion() {
        return question;
    }
    public String getAnswer() {
        return answer;
    }
    public int getScore() {
        if (!hasScore) {
            System.out.println("[!] Question does not have a score!");
            return -1;
        }
        return score;
    }
}

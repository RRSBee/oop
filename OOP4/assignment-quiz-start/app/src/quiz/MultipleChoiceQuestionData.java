// Made by Raveena Boedhram s1074078 
// Quint van Oorschot s1098812

package quiz;

import java.util.List;

public class MultipleChoiceQuestionData {

    private String question;
    private String[] answers;
    private int correctAnswer, score;
    private boolean hasScore;

    MultipleChoiceQuestionData (String _question, String[] _answers, int _correctAnswer, int _score)  {
        question = _question;
        answers =  _answers;
        correctAnswer = _correctAnswer;
        score = _score;
        hasScore = true;
    }
    MultipleChoiceQuestionData (String _question, String[] _answers, int _correctAnswer)  {
        question = _question;
        answers = _answers;
        hasScore = false;
    }

    public String getQuestion() {
        return question;
    }
    public String getAnswer() {
        if (correctAnswer == 0){
            return "a)" + answers[0];
        } else if(correctAnswer == 1){
            return "b)" + answers[1];
         } else if (correctAnswer == 2){
            return "c" + answers[2];
         } else return "d)" + answers[3];
    
    }
        


    
    public int getScore() {
        if (!hasScore) {
            System.out.println("[!] Question does not have a score!");
            return -1;
        }
        return score;
    }
    
}


   

// Made by Raveena Boedhram s1074078 
// Quint van Oorschot s1098812

package quiz;

// It's basically the interface I think...

public class Game {
    // implements the logic of asking two rounds of questions.

    private static void introMsg() {
        System.out.println("Official Quiz Challenge (OQC 2023):\n");
    }

    private static void OpenQuestions() {
        int i = 0;
        OpenQuestionsList questions = new OpenQuestionsList();
        questions.importQuestions();
        OpenQuestionData OpenQuestionData = questions.getQuestionByIndex(i);
        OpenQuestion openQuestion = new OpenQuestion(OpenQuestionData.getQuestion(), OpenQuestionData.getAnswer(), OpenQuestionData.getScore());
    }

    public void startGame() {
        introMsg();
        OpenQuestions();
    }
}

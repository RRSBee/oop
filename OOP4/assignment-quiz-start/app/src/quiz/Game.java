// Made by Raveena Boedhram s1074078 
// Quint van Oorschot s1098812

package quiz;

// It's basically the interface I think...

public class Game {
    // implements the logic of asking two rounds of questions.

    public void startGame() {
        introMsg();
        OpenQuestions();

        
        /*  Implement these later:
        MultipleChoiceQuestions();
        ThisThatQuestions();
        */




    }

    private static void introMsg() {
        System.out.println("Official Quiz Challenge (OQC 2023):\n");
    }

    private static void OpenQuestions() {
        int i = 0;
        OpenQuestionsList questions = new OpenQuestionsList();
        questions.importQuestions();
        OpenQuestionData OpenQuestionData = questions.getQuestionByIndex(i);
        OpenQuestion openQuestion = new OpenQuestion(OpenQuestionData.getQuestion(), OpenQuestionData.getAnswer(), OpenQuestionData.getScore());
        i++;
    }

    private static void MultipleChoiceQuestions() {
        int i = 0;
        MultipleChoiceQuestionsList questions = new MultipleChoiceQuestionsList();
        questions.importQuestions();
        MultipleChoiceQuestionData MultipleChoiceQuestionData = questions.getQuestionByIndex(i);
        MultipleChoiceQuestion MultipleChoiceQuestion = new MultipleChoiceQuestion(MultipleChoiceQuestionData.getQuestion(), MultipleChoiceQuestionData.getAnswer(), MultipleChoiceQuestionData.getScore());
    }

    private static void ThisThatQuestions() {
        int i = 0;
        ThisThatQuestionsList questions = new ThisThatQuestionsList();
        questions.importQuestions();
        ThisThatQuestionData ThisThatQuestionData = questions.getQuestionByIndex(i);
        ThisThatQuestion ThisThatQuestion = new ThisThatQuestion(ThisThatQuestionData.getQuestion(), ThisThatQuestionData.getAnswer(), ThisThatQuestionData.getScore());
    }



   

    
}

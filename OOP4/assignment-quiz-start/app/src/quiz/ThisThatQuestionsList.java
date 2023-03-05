// Made by Raveena Boedhram s1074078 
// Quint van Oorschot s1098812

package quiz;

import java.util.ArrayList;
import java.util.List;

public class ThisThatQuestionsList {
    List<ThisThatQuestionData> questions = new ArrayList<>();

    public void importQuestions() {
        questions.add(new ThisThatQuestion("Every class must have a constructor", "Right", "Wrong", 1));
        questions.add(new ThisThatQuestion("Is there a difference between an interface and an abstract class?", "Yes", "No", 0, 5));
        questions.add(new ThisThatQuestion("Is there a maximum to the amount of constructors a class can have in Java?", "Yes", "No", 1));
    } //PROBLEM: Why is questions.add red??




    public int getSize() {
        return questions.size();
    }

    public ThisThatQuestionData getQuestionByIndex(int index) {

        if (index > questions.size() - 1) {
            System.out.println("Index cannot be greater than size of questions list: defaulted to index 0!");
            return questions.get(0);
        }
        return questions.get(index); // Dit moet nog in "answer1 or answer2" formaat
    }



}

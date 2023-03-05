// Made by Raveena Boedhram s1074078 
// Quint van Oorschot s1098812

package quiz;

import java.util.ArrayList;
import java.util.List;

public class MultipleChoiceQuestionsList {
    List<MultipleChoiceQuestionData> questions = new ArrayList<>();

    public void importQuestions() {
        questions.add(new MultipleChoiceQuestionData("What is the best achievable complexity of in situ sorting?", new String[] { "O(N^2)", "O(N log N)", "O(N)", "O(log N)" }, 1, 4));
        questions.add(new MultipleChoiceQuestionData("How do you print \"Hello world\" on a line in Java?", new String[] { "System.out.print(\"Hello world\");", "System.out.println(\"Hello world\");", "cout << \"Hello world\";" }, 1));
        questions.add(new MultipleChoiceQuestionData("How do you read a non-empty word in Java using scanner s?", new String[] { "s.nextline()", "s.next(\"\\S+\")", "s.next(\"\\a*\")", "s.next(\"\\S*\")", "s.next(\"\\\\s+\")", "s.next(\"\\s+\")", "s.nextString(\"\\s*\")", "s.next(\"\\\\S+\")", "s.nextString()" }, 7, 1));
    } //PROBLEM: It doesnt see the String[] answers.

    public int getSize() {
        return questions.size();
    }

    public MultipleChoiceQuestionData getQuestionByIndex(int index) {

        if (index > questions.size() - 1) {
            System.out.println("Index cannot be greater than size of questions list: defaulted to index 0!");
            return questions.get(0);
        }
        return questions.get(index); // dit moet nog in a) b) c) d) formaat gebeuren
    }



}
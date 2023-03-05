// Made by Raveena Boedhram s1074078 
// Quint van Oorschot s1098812

package quiz;

import java.util.ArrayList;
import java.util.List;

public class OpenQuestionsList {
    
    List<OpenQuestionData> questions = new ArrayList<>();
    public void importQuestions() {
        questions.add(new OpenQuestionData("What is the capital of France?", "Paris", 3));
        questions.add(new OpenQuestionData("How many roads must a man walkdown?", "42", 5));
        questions.add(new OpenQuestionData("What is the big O complexity of binary search?", "O(log N)"));
        questions.add(
                new OpenQuestionData("How would you read an integer i from scanner s in Java?", "i = s.nextInt();", 2));
        questions.add(new OpenQuestionData(
                "What is the minimum amount of constructors you have to define for a class in Java?", "0", 2));
    }

    public int getSize() {
        return questions.size();
    }

    public OpenQuestionData getQuestionByIndex(int index) {
        if (index > questions.size()-1) {
            System.out.println("Index cannot be greater than size of questions list: defaulted to index 0!");
            return questions.get(0);
        }
        return questions.get(index);
    }
}

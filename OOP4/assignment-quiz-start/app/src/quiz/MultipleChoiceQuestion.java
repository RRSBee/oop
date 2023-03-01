package quiz;

public class MultipleChoiceQuestion extends Questions {

    /**
     * @param question
     * @param answers all possible answers from the toString function.
     * @param correctAnswer is the index of the correct answer in the array of answers.
     * @param score
     */
    public MultipleChoiceQuestion (String question , String [] answers, int correctAnswer , int score) {
        //
        // The toString function should print all possible answers, preceded by a), b), c), and so on.
        // The correct answer for a multiple choice question is the letter of the respective answer.

    }
    
    /**
     * @param question
     * @param answers all possible answers from the toString function.
     * @param correctAnswer is the index of the correct answer in the array of answers.
     */
    public MultipleChoiceQuestion (String question , String [] answers, int correctAnswer ) {
        //
        // The toString function should print all possible answers, preceded by a), b), c), and so on.
        // The correct answer for a multiple choice question is the letter of the respective answer.
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toString'");
    }

    @Override
    public boolean isCorrect(String answer) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isCorrect'");
    }

    @Override
    public String correctAnswer() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'correctAnswer'");
    }



}

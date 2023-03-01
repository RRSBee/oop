package quiz;

public abstract class Questions { //BASE CLASS

    private int score;

    public Questions (int score) {
        setScore(score);
    }

    
    //@Override
    public abstract String toString (); // Return a string that can be used to display the question.
    
    /**
     * @param answer
     * @return wheter an answer is correct.
     * Program should not distinguish between uppercase and lowercase letters in answers.
     */
    public abstract boolean isCorrect (String answer);

    /**
     * @return a string of the correct answer as a printable text.
     * This text is shown when the user makes a mistake.
     */
    public abstract String correctAnswer ();
    

    public int getScore () {
        return score;
    }

    /**
     * Each question has a score. The score is a number between 1 and 5.
     * If the score is specified with an incorrect value, the question should have a score of 3.
     * @param score of the question
     */
    public void setScore(int score) {
        if (score < 1 || score > 5) {
            this.score = 3;
        } else {
            this.score = score;
        }
    }

 
}

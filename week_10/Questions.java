public class Questions {
    private final String question;
    private final String option1;
    private final String option2;
    private final String answer;

    public Questions(String question, String option1, String option2, String answer) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public boolean isCorrect(String choice) {
        return choice.equals(answer);
    }
}
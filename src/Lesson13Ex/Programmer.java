package Lesson13Ex;

public class Programmer extends Employee implements Training {

    private String programmingLanguage;

    public Programmer(String name, int age, String programmingLanguage) {
        super(name, age);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void attendTraining() {
        System.out.println("Programmer " + getName() + " is attending the training");
    }

}

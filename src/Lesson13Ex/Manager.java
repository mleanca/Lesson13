package Lesson13Ex;

public class Manager extends Employee implements Training, Interview {

    private int departmentSize;

    public Manager(String name, int age, int departmentSize) {
        super(name, age);
        this.departmentSize = departmentSize;
    }

    public void setDepartmentSize() {
        this.departmentSize = departmentSize;
    }

    public String getDepartmentSize(String departmentSize) {
        return departmentSize;
    }

    @Override
    public void conductInterview() {
        System.out.println("Manager " + getName() + " is conducting the interview");
    }

    @Override
    public void attendTraining() {
        System.out.println("Manager " + getName() + " is attending the training");
    }
}

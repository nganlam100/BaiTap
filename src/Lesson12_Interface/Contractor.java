package Lesson12_Interface;

public class Contractor implements IEmployee {
    @Override
    public int getSalary() {
        return 40000;
    }

    @Override
    public int getSupportSalary() {
        return 0;
    }
}

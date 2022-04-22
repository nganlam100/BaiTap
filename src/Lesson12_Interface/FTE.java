package Lesson12_Interface;

public class FTE implements IEmployee{
    @Override
    public int getSalary() {
        return 50000;
    }

    @Override
    public int getSupportSalary() {
        return 1000;
    }
}

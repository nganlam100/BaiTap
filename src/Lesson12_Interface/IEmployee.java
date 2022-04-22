package Lesson12_Interface;

public interface IEmployee {
    int getSalary();
    int getSupportSalary();

    default int getTotalSalary(){
        return getSalary() + getSupportSalary();
    }
}

package Scheduler;

import java.time.LocalDate;
import java.util.Date;

public class Student extends Person {

    private Boolean hasPreviousJavaKnowledge;

    public Student(String firstName, String lastName, String dateOfBirth, Boolean hasPreviousJavaKnowledge) {
        super(firstName, lastName, dateOfBirth);
        this.hasPreviousJavaKnowledge = hasPreviousJavaKnowledge;
    }

    public Boolean getHasPreviousJavaKnowledge() {
        return hasPreviousJavaKnowledge;
    }

    public void setHasPreviousJavaKnowledge(Boolean hasPreviousJavaKnowledge) {
        this.hasPreviousJavaKnowledge = hasPreviousJavaKnowledge;
    }



    @Override
    public String toString() {
        return "Student{" + super.toString()+
                "hasPreviousJavaKnowledge=" + hasPreviousJavaKnowledge +
                '}';
    }
}

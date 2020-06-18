package Scheduler;

import java.util.List;

public class StudentJavaKnowledgeEvaluation {
    private List<Student> studentList;

    public StudentJavaKnowledgeEvaluation(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void invoke() {
        for (Student student: studentList) {
            if(student.getHasPreviousJavaKnowledge()==true) {
                System.out.println(student);
            }
        }
    }
}

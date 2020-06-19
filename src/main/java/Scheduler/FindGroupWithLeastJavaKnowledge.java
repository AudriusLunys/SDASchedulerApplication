package Scheduler;

import java.util.Set;

public class FindGroupWithLeastJavaKnowledge {
    private Set<Student> studentsInSDA1;
    private Set<Student> studentsInSDA2;
    private Set<Student> studentsInSDA3;
    private Set<Student> studentsInSDA4;

    public FindGroupWithLeastJavaKnowledge(Set<Student> studentsInSDA1, Set<Student> studentsInSDA2, Set<Student> studentsInSDA3, Set<Student> studentsInSDA4) {
        this.studentsInSDA1 = studentsInSDA1;
        this.studentsInSDA2 = studentsInSDA2;
        this.studentsInSDA3 = studentsInSDA3;
        this.studentsInSDA4 = studentsInSDA4;
    }

    public void invoke() {
        int counterSDA1 = 0;
        int counterSDA2 = 0;
        int counterSDA3 = 0;
        int counterSDA4 = 0;
        for (Student student : studentsInSDA1) {
            if (student.getHasPreviousJavaKnowledge() == false) {
                counterSDA1++;
            }

        }

        for (Student student : studentsInSDA2) {
            if (student.getHasPreviousJavaKnowledge() == false) {
                counterSDA2++;
            }

        }
        for (Student student : studentsInSDA3) {
            if (student.getHasPreviousJavaKnowledge() == false) {
                counterSDA3++;
            }
        }
        for (Student student : studentsInSDA4) {
            if (student.getHasPreviousJavaKnowledge() == false) {
                counterSDA4++;
            }
        }
        if (counterSDA1 > counterSDA2 && counterSDA1 > counterSDA3 && counterSDA1 > counterSDA4) {
            System.out.println("The group with the highest number of students with no previous java knowledge:" + studentsInSDA1);
        } else if (counterSDA2 > counterSDA1 && counterSDA2 > counterSDA3 && counterSDA2 > counterSDA4) {
            System.out.println("The group with the highest number of students with no previous java knowledge:" + studentsInSDA2);
        } else if (counterSDA3 > counterSDA1 && counterSDA3 > counterSDA2 && counterSDA3 > counterSDA4){
            System.out.println("The group with the highest number of students with no previous java knowledge:" + studentsInSDA3);
        } else System.out.println("The group with the highest number of students with no previous java knowledge:" + studentsInSDA3);
    }
}

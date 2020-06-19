package Scheduler;

import java.util.*;

public class GroupSort {
    private Set<Student> studentsInSDA1;
    private Set<Student> studentsInSDA2;
    private Set<Student> studentsInSDA3;
    private Set<Student> studentsInSDA4;

    public GroupSort(Set<Student> studentsInSDA1, Set<Student> studentsInSDA2, Set<Student> studentsInSDA3, Set<Student> studentsInSDA4) {
        this.studentsInSDA1 = studentsInSDA1;
        this.studentsInSDA2 = studentsInSDA2;
        this.studentsInSDA3 = studentsInSDA3;
        this.studentsInSDA4 = studentsInSDA4;
    }

    public void invoke() {
        System.out.println("students in group SDA1 Sorted By Lastname");
        sortGroup(studentsInSDA1);
        System.out.println("students in group SDA2 Sorted By Lastname");
        sortGroup(studentsInSDA2);
        System.out.println("students in group SDA3 Sorted By Lastname");
        sortGroup(studentsInSDA3);
        System.out.println("students in group SDA4 Sorted By Lastname");
        sortGroup(studentsInSDA4);
    }

    private void sortGroup(Set<Student> studentsInSDA1) {

        List<Student> sda1List = new ArrayList<>();
        sda1List.addAll(studentsInSDA1);
        Collections.sort(sda1List, Comparator.comparing(Student::getLastName));
        System.out.println(sda1List.toString());
    }
}

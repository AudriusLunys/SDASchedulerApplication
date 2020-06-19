package Scheduler;

import java.util.*;

public class MakeGroups {

    static void runGroupMaker() {


        Trainer trainer1 = new Trainer("Vladas", "Kietas", "1983-05-25", true);
        Trainer trainer2 = new Trainer("Birute", "Viesuliene", "1988-12-01", true);
        Trainer trainer3 = new Trainer("Vydas", "Vader", "1990-11-13", true);


        List<Trainer> trainerList = new ArrayList<>();
        trainerList.add(trainer1);
        trainerList.add(trainer2);
        trainerList.add(trainer3);

        Student student1 = new Student("Audrius", "Lunys", "1983-05-28", false);
        Student student2 = new Student("Andrius", "Maironis", "1988-09-01", true);
        Student student3 = new Student("Martynas", "Papartynas", "1999-01-09", true);
        Student student4 = new Student("Vladas", "Gaurys", "2002-11-15", false);
        Student student5 = new Student("Vacys", "Maslionka", "1963-09-21", false);
        Student student6 = new Student("Jonas", "Jonka", "1945-03-01", true);
        Student student7 = new Student("Girdvainis", "Balandis", "1975-05-14", false);
        Student student8 = new Student("Klaudijus", "Dzonsonas", "2006-04-08", false);
        Student student9 = new Student("Jurijus", "Gagarinas", "1966-06-14", false);
        Student student10 = new Student("Grzegorz", "Brzęczyszczykiewicz", "1993-08-20", true);
        Student student11 = new Student("Maryte", "Dagiene", "1988-11-03", false);
        Student student12 = new Student("Julija", "Alaunis", "2000-07-17", true);
        Student student13 = new Student("Petrute", "Balandiene", "1987-01-28", true);
        Student student14 = new Student("Alysa", "Gailiene", "1989-09-01", true);
        Student student15 = new Student("Natalija", "Bulke", "1980-01-03", false);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);
        studentList.add(student8);
        studentList.add(student9);
        studentList.add(student10);
        studentList.add(student11);
        studentList.add(student12);
        studentList.add(student13);
        studentList.add(student14);
        studentList.add(student15);


        Set<Student> studentsInSDA1 = new HashSet<>();
        studentsInSDA1.add(student1);
        studentsInSDA1.add(student2);
        studentsInSDA1.add(student3);
        studentsInSDA1.add(student4);

        Set<Student> studentsInSDA2 = new HashSet<>();
        studentsInSDA2.add(student5);
        studentsInSDA2.add(student6);
        studentsInSDA2.add(student7);
        studentsInSDA2.add(student8);

        Set<Student> studentsInSDA3 = new HashSet<>();

        studentsInSDA3.add(student9);
        studentsInSDA3.add(student10);
        studentsInSDA3.add(student11);
        studentsInSDA3.add(student12);

        Set<Student> studentsInSDA4 = new HashSet<>();
        studentsInSDA4.add(student13);
        studentsInSDA4.add(student14);
        studentsInSDA4.add(student15);


        Group group1 = new Group("SDA1", trainer1, studentsInSDA1);
        Group group2 = new Group("SDA2", trainer2, studentsInSDA2);
        Group group3 = new Group("SDA3", trainer3, studentsInSDA3);
        Group group4 = new Group("SDA4", trainer1, studentsInSDA4);

        List<Group> groupList = new ArrayList<>();
        groupList.add(group1);
        groupList.add(group2);
        groupList.add(group3);
        groupList.add(group4);

        printGroupsData(groupList);
        System.out.println("************************************************************");
        System.out.println("all students in a group sorted alphabetically by lastName");

        new GroupSort(studentsInSDA1, studentsInSDA2, studentsInSDA3, studentsInSDA4).invoke();
        System.out.println("************************************************************");
        System.out.println("students with Java Knowledge in all groups");
        new StudentJavaKnowledgeEvaluation(studentList).invoke();
        System.out.println("************************************************************");
        System.out.println("Display all students grouped by trainer that teaches to them");
        new StudentsByTrainer(trainer1, trainer2, trainer3, groupList).invoke();





    }

    private static void printGroupsData(List<Group> groupList) {
        System.out.println("GROUPS, TRAINERS AND STUDENTS OF SDA");
        for (Group group : groupList) {
            System.out.println(group);
        }
    }


}





    















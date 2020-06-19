package Scheduler;

import java.util.*;

public class ShedulerFacade {

    static void runGroupMaker() {


        PeopleInitializer peopleInitializer = new PeopleInitializer().invoke();
        Trainer trainer1 = peopleInitializer.getTrainer1();
        Trainer trainer2 = peopleInitializer.getTrainer2();
        Trainer trainer3 = peopleInitializer.getTrainer3();
        List<Student> studentList = peopleInitializer.getStudentList();
        Set<Student> studentsInSDA1 = peopleInitializer.getStudentsInSDA1();
        Set<Student> studentsInSDA2 = peopleInitializer.getStudentsInSDA2();
        Set<Student> studentsInSDA3 = peopleInitializer.getStudentsInSDA3();
        Set<Student> studentsInSDA4 = peopleInitializer.getStudentsInSDA4();
        List<Group> groupList = peopleInitializer.getGroupList();

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
        System.out.println("************************************************************");
        System.out.println("Display group with Least Java Knowledge");
        new FindGroupWithLeastJavaKnowledge(studentsInSDA1, studentsInSDA2, studentsInSDA3, studentsInSDA4).invoke();

    }


    private static void printGroupsData(List<Group> groupList) {
        System.out.println("GROUPS, TRAINERS AND STUDENTS OF SDA");
        for (Group group : groupList) {
            System.out.println(group);
        }
    }



}





    















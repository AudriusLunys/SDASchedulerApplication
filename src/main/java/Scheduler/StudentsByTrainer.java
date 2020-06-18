package Scheduler;

import java.util.List;

public class StudentsByTrainer {
    private Person trainer1;
    private Person trainer2;
    private Person trainer3;
    private List<Group> groupList;

    public StudentsByTrainer(Person trainer1, Person trainer2, Person trainer3, List<Group> groupList) {
        this.trainer1 = trainer1;
        this.trainer2 = trainer2;
        this.trainer3 = trainer3;
        this.groupList = groupList;
    }

    public void invoke() {
        for (Group group : groupList) {
            if (group.getTrainer() == trainer1) {
                System.out.println("Students of :" + trainer1.getFirstName() +" "+trainer1.getLastName()+ group.getStudentsInGroup());
            } else if (group.getTrainer()==trainer2) {
                System.out.println("Students of :" + trainer2.getFirstName()+" "+trainer2.getLastName()+ group.getStudentsInGroup());
            } else if (group.getTrainer()==trainer3) {
                System.out.println("Students of :" + trainer3.getFirstName()+" "+trainer3.getLastName()+ group.getStudentsInGroup());
            }
        }
    }
}


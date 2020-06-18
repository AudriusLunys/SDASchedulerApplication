package Scheduler;

import java.util.*;

public class Group {

    String groupName;
    Person trainer;
    Set<Person> studentsInGroup;

    public Group(String groupName, Person trainer, Set<Person> studentsInGroup) {
        this.groupName = groupName;
        this.trainer = trainer;
        this.studentsInGroup = studentsInGroup;

    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Person getTrainer() {
        return trainer;
    }

    public void setTrainer(Person trainer) {
        this.trainer = trainer;
    }

    public Set<Person> getStudentsInGroup() {
        return studentsInGroup;
    }

    public void setStudentsInGroup(Set<Person> studentsInGroup) {
        this.studentsInGroup = studentsInGroup;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", trainer=" + trainer +
                ", studentsInGroup=" + studentsInGroup +
                '}';
    }
}



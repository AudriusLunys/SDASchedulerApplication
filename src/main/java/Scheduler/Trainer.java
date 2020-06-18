package Scheduler;

import java.time.LocalDate;
import java.util.Date;

public class Trainer extends Person {

    private Boolean isAuthorized;

    public Trainer(String firstName, String lastName,String dateOfBirth, Boolean isAuthorized) {
        super(firstName, lastName, dateOfBirth);
        this.isAuthorized = isAuthorized;
    }

    public Boolean getAuthorized() {
        return isAuthorized;
    }

    public void setAuthorized(Boolean authorized) {
        isAuthorized = authorized;
    }

    @Override
    public String toString() {
        return "Trainer{" + super.toString()+
                "isAuthorized=" + isAuthorized +
                '}';
    }
}

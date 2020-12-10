package sample;

import java.util.ArrayList;
import java.util.List;

public class Students {
    private static Students  students;

    private  final List<String> emails = new ArrayList<>();

    private Students(){}

    public List<String> getEmails() {
        return emails;
    }

    public static Students getInstance() {
        if(students == null) {
            students = new Students();
        }

        return students;
    }
}

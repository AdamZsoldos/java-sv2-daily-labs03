package day05;

import java.util.ArrayList;
import java.util.List;

public class Journal {

    private List<String> students = new ArrayList<>();

    public List<String> getStudents() {
        return students;
    }

    public boolean addStudent(String name) {
        if (!name.contains(" ")) return false;
        students.add(name);
        return true;
    }
}

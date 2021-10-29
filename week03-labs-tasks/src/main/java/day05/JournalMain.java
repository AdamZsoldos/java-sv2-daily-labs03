package day05;

public class JournalMain {
    public static void main(String[] args) {

        Journal journal = new Journal();

        System.out.println(journal.addStudent("Johnny"));
        System.out.println(journal.addStudent("John Doe"));
        System.out.println(journal.addStudent("Jane Doe"));

        System.out.println(journal.getStudents());
    }
}

package day01;

public class School {

    public static void main(String[] args) {

        Students students = new Students();

        students.addHeight(100);
        students.addHeight(110);
        students.addHeight(120);
        students.addHeight(140);

        System.out.println("students: " + students);
        System.out.println("students.isHeightIncreasing(): " + students.isHeightIncreasing());

        students.addHeight(130);
        students.addHeight(150);

        System.out.println("students: " + students);
        System.out.println("students.isHeightIncreasing(): " + students.isHeightIncreasing());
    }
}

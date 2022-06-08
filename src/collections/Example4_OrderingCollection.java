package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Example4_OrderingCollection {
    public static void main(String[] args) {
        Subject subject1 = new Subject("Python", 10);
        Subject subject2 = new Subject("JavaScript", 6);
        Subject subject3 = new Subject("Java", 8);
        Subject subject4 = new Subject("SQL", 15);

        ArrayList<Subject> subjects = new ArrayList<>();
        subjects.add(subject1);
        subjects.add(subject2);
        subjects.add(subject3);
        subjects.add(subject4);

        subjects.sort(Comparator.comparing(Subject::getName));
        System.out.println(subjects); // [Java, JavaScript, Python, SQL]

    }
}

package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

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

        /*subjects.sort(Comparator.comparing(Subject::getName));
        System.out.println(subjects); */

        Collections.sort(subjects, Comparator.comparing(Subject::getName));
        System.out.println(subjects); // [Java, JavaScript, Python, SQL]
        Collections.sort(subjects, Comparator.comparing(Subject::getName).reversed());
        System.out.println(subjects); // [SQL, Python, JavaScript, Java]

        //Stream() - Ordering excluding Javascript
        List<Subject> subjectlist = subjects.stream().filter(subject -> !subject.getName().equalsIgnoreCase("JavaScript")).sorted(Comparator.comparing(Subject::getName).reversed()).collect(Collectors.toList());
        System.out.println(subjectlist); //[SQL, Python, Java]
    }
}

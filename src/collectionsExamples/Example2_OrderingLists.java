package collectionsExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example2_OrderingLists {
    public static void main(String[] args) {
        String curso1 = "Magic 101";
        String curso2 = "Programming";
        String curso3 = "Art & Crafts";
        String curso4 = "Mindset";

        ArrayList<String> listaCursos = new ArrayList<>();

        // adicionar un valor a la variable listaCursos
        listaCursos.add(curso1);
        listaCursos.add(curso2);
        listaCursos.add(curso3);
        listaCursos.add(curso4);

        System.out.println(listaCursos); //[Magic 101, Programming, Art & Crafts, Mindset]

        // Collections - orden de menor a mayor
        Collections.sort(listaCursos);
        System.out.println(listaCursos); //[Art & Crafts, Magic 101, Mindset, Programming]
        Collections.sort(listaCursos, Collections.reverseOrder());
        System.out.println(listaCursos); //[Programming, Mindset, Magic 101, Art & Crafts]

        // ahora usando el metodo sort y Comparator(java.util)
        listaCursos.sort(Comparator.naturalOrder());
        System.out.println(listaCursos); //[Art & Crafts, Magic 101, Mindset, Programming]
        listaCursos.sort(Comparator.reverseOrder());
        System.out.println(listaCursos); //[Programming, Mindset, Magic 101, Art & Crafts]

        // Stream y sorted -a partir de Java 8
        //listaCursos.stream().sorted().collect(Collectors.toList());
        List<String> cursosList = listaCursos.stream().sorted().collect(Collectors.toList());
        System.out.println(cursosList);  //[Art & Crafts, Magic 101, Mindset, Programming]
    }
}

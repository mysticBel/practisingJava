package collectionsExamples;

import java.util.ArrayList;

public class Example1_ReadingLists {
    public static void main(String[] args) {
        String variable1 = "Ejem 1";
        String variable2 = "Ejem 2";
        String variable3 = "Ejem 3";
        String variable4 = "Ejem 4";
        String variable5 = "Ejem 5";

        ArrayList<String> lista = new ArrayList<>();

        // adicionar un valor a la variable lista
        lista.add(variable1);
        lista.add(variable2);
        lista.add(variable3);
        lista.add(variable4);
        lista.add(variable5);

        System.out.println(lista); // [Ejem 1, Ejem 2, Ejem 3, Ejem 4, Ejem 5]

        //remover
        lista.remove(2);
        System.out.println(lista); //[Ejem 1, Ejem 2, Ejem 4, Ejem 5]

        //set-modificar
        lista.set(2, "Ejem alterado");
        System.out.println(lista); //[Ejem 1, Ejem 2, Ejem alterado, Ejem 5]

        //size method
        System.out.println(lista.size()); //4

        // Leer un ArrayList
        // forma (1)
        for (int i = 0 ; i < lista.size(); i++) {
            System.out.println(lista.get(i));  //get sirve para ubicar la posición
        }
        /*
        * Ejem 1
        * Ejem 2
        * Ejem alterado
        * Ejem 5
        * */

        // forma (2)
        for(String ejemListaString: lista) {
            System.out.println(ejemListaString);
        }

        // forma (3)
        lista.forEach(ejem -> {
            System.out.println(ejem);
        });

    }
}

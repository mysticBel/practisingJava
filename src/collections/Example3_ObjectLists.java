package collections;

import java.util.ArrayList;

public class Example3_ObjectLists {
    public static void main(String[] args) {
        Hobby hobby1 = new Hobby("Listening to music", 5);
        Hobby hobby2 = new Hobby("Watching the stars", 3);
        Hobby hobby3 = new Hobby("Reading poems and song lyrics", 3);
        Hobby hobby4 = new Hobby("Talking with friends", 4);
        Hobby hobby5 = new Hobby("Daydreaming", 8);

        ArrayList<Hobby> hobbyList = new ArrayList<>();
        hobbyList.add(hobby1);
        hobbyList.add(hobby2);
        hobbyList.add(hobby3);
        hobbyList.add(hobby4);
        hobbyList.add(hobby5);

        System.out.println( hobbyList); //[collectionsExamples.Hobby@58372a00, ...] prints an object
        // implementing override in class Hobby
        System.out.println( hobbyList); //[Listening to music, ...,  Daydreaming]


    }


}

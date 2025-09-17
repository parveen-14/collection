package collection_programs;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class iterateArraylist {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(10);
        list.add(3);
        list.add(15);
        list.add(25);
        System.out.println("List of the elements: " + list);

        ListIterator<Integer> iterator=list.listIterator();
        while(iterator.hasNext()) {  //it checks whether next element is present or not if not then it terminates.
            int index = iterator.nextIndex();
            Integer i = iterator.next();
            System.out.println("Index " + index + " value is " + i);


        }
}
}


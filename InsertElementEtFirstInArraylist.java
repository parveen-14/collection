package collection_programs;

import java.util.ArrayList;

public class InsertElementEtFirstInArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(100);
        list.add(30);
        list.add(200);
        System.out.println(list);
        list.add(0,500);

        for(Integer i:list){
            System.out.println(i);
        }
    }
}

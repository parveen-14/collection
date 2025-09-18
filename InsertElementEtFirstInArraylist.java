package collection_programs;

import java.util.ArrayList;

public class InsertElementEtFirstInArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(100);
        list.add(30);
        list.add(200);
        list.add(500);
        System.out.println(list);
        list.add(0,500);
        list.add(1,300);

        for(Integer it:list){
            System.out.println(it);
        }
    }
}

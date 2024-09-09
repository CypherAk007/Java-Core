package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class O20_ArrayList {
    public static void main(String[] args) {
        // CREATE LIST 
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(10);
        // INSERT AT GIVEN POSITON->INDEX 
        list2.add(0, 200);
        System.out.println(list2);

        // APPEND NEW LIST2 TO EXISTING LIST 
        list.addAll(list2);
        System.out.println(list);

        // REMOVE ELE GIVEN INDEX 
        list.remove(1);
        System.out.println(list);

        // REMOVE ELE GIVEN VALUE 
        list.remove(Integer.valueOf(10));
        System.out.println(list);

        // ARR[0] = 100 
        list.set(0, 1000);
        System.out.println(list);

        // CHECK IF ELE EXISTS IN ARR
        System.out.println(list.contains(200));

        // ITRATE THE LIST 
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }

        for (Integer element : list) {
            System.out.println(element);
        }
        // USING ITRATOR 
        Iterator<Integer> it  = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // CLEAR THE WHOLE LIST 
        list.clear();
    }
}

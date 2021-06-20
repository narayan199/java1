package CollectionFrame;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(17);
        list1.add(18);
    //For eachs
        for (Integer I:list1)
    {
        System.out.println(I);
    }
        Iterator<Integer> itr = list1.iterator();
        while (itr.hasNext())
        {
            Integer a = itr.next();
            System.out.println(a);
        }
        //for each
        list1.forEach(e-> System.out.println(e));
        //back trasaverse
        ListIterator<Integer> btc = list1.listIterator(list1.size());
        while (btc.hasPrevious())
        {
            Integer a = btc.previous();
            System.out.println(a);
        }
    }
}


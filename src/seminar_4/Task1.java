package seminar_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    /*
    1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
    2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
    */
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        System.out.println(testSpeed(list1));
        System.out.println(testSpeed(list2));
    }

    private static long testSpeed(List<Integer> list1) {
        long timeStart1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list1.add(list1.size()/2, i);
        }
        long timeFinish1 = System.currentTimeMillis();
        return timeFinish1 - timeStart1;
    }
}
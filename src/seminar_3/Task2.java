package seminar_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Task2 {
    /*
    Заполнить список десятью случайными числами.
    Отсортировать список методом sort() и вывести его на экран.
     */
    public static void main(String[] args) {
        List<Integer> list = createList(2, 10, 10);
        System.out.println(list);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
    }

    static List<Integer> createList(int min, int max, int count){
        List<Integer> list = new ArrayList<>(count);
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            list.add(random.nextInt(min, max + 1));
        }
        return list;
    }
}


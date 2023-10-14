package seminar_3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Task3 {
    /*
    Создать список типа ArrayList
    Поместить в него как строки, так и целые числа.
    Пройти по списку, найти и удалить целые числа.
     */
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(5);
        list.add(13);
        list.add("привет");
        list.add(3.14);
        list.add("4");
        removeIntegersV2(list);
        System.out.println(list);
    }

    static void removeIntegers(List list){
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj instanceof Integer){
                list.remove(i);
                i--;
            }
        }
    }

    static void removeIntegersV2(List list){
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            if (obj instanceof Integer){
                iterator.remove();
            }
        }
    }
}
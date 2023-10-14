package seminar_4;

import java.util.*;

public class Task4 {
    /*
    1) Написать метод, который принимает массив элементов, помещает их в стэк
    и выводит на консоль содержимое стэка.
    2) Написать метод, который принимает массив элементов, помещает их в очередь
    и выводит на консоль содержимое очереди.
    */
    public static void main(String[] args) {
        String[] arr = new String[]{"1", "2", "3", "4"};
        testQueue(arr);
    }

    static void testQueue(String[] arr){
        Queue<String> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(arr));

//        System.out.println(queue);

//        for (String s: queue){
//            System.out.println(s);
//        }

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }

    static void testStack(String[] arr){
        Stack<String> stack = new Stack<>();
        stack.addAll(Arrays.asList(arr));

//        System.out.println(stack);

//        for (String s: stack){
//            System.out.println(s);
//        }

        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}
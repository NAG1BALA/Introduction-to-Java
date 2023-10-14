package seminar_6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task2 {
    /*
    1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
    2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент
    уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
    Для вычисления процента используйте формулу:
    процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
    */
    public static void main(String[] args) {
        Integer [] arr1 = randomArray(0, 24, 1000);
        System.out.println(Arrays.toString(arr1));
        double a = percent(arr1);
        System.out.println(a);
    }

    static Integer [] randomArray (int min, int max, int size) {
        Random random = new Random();
        Integer [] arr = new Integer [size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(min, max + 1);
        }
        return arr;
    }

    static double percent (Integer [] arr) {
        Set<Integer> list = new HashSet<>(Arrays.asList(arr));
        double size = list.size();
        double res = size * 100 / arr.length;
        return res;
    }

}

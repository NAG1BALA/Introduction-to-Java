package seminar_1;

public class Task5 {
    /*
    Реализовать функцию возведения числа а в степень b. a, b из Z.
    Сводя количество выполняемых действий к минимуму.
    Пример 1: а = 3, b = 2, ответ: 9
    Пример 2: а = 2, b = -2, ответ: 0.25
    Пример 3: а = 3, b = 0, ответ: 1
    */
    public static void main(String[] args) {
        int a = 2;
        int b = 564;
        System.out.println(pow(a, b));
    }

    static double pow(int a, int b){
        if (b == 0){
            return 1;
        }
        if (a == 0 || b == 1){
            return a;
        }
        double a1 = a;
        if (b < 0){
            a1 = 1 / a1;
            b = -b;
        }
        double res = 1;
        for (int i = 0; i < b; i++) {
            res *= a1;
        }
        return res;
    }
}

package lection_1;
/*
ЦИКЛЫ
 */


/*
цикл WHILE
 */
public class Cycles {
    public static void main(String[] args) {
        int value = 321;
        int count = 0;
        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count);
    }
}


/*
цикл DO WHILE
 */
//public class Cycles {
//    public static void main(String[] args) {
//        int value = 321;
//        int count = 0;
//        do {
//            value /= 10;
//            count++;
//        } while (value != 0);
//        System.out.println(count);
//    }
//}


/*
Оператор цикла FOR
 */

//public class Cycles {
//    public static void main(String[] args) {
//        int s = 0;
//        for (int i = 1; i <= 10; i++) {
//            s += i;
//        }
//        System.out.println(s);
//    }
//}


/*
ВЛОЖЕННЫЕ ЦИКЛЫ
 */

//public class Cycles {
//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//// * * * * *
//// * * * * *
//// * * * * *
//// * * * * *
//// * * * * *
//    }
//}

/*
FOR для коллекций
 */

//public class Cycles {
//    public static void main(String[] args) {
//        int arr[] = new int[10];
//        for (int item : arr) {
//            System.out.printf("%d ", item);
//        }
//        System.out.println();
//    }
//}
package lection_1;
/*
УПРАВЛЯЮЩИЕ КОНСТРУКЦИИ
 */
public class Control_structures {
    /*
    УСЛОВНЫЙ ОПЕРАТОР
     */
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        System.out.println(c);
    }
}

//    public class Control_structures {
//        public static void main(String[] args) {
//           int a = 1;
//            int b = 2;
//            int c = 0;
//            if (a > b) c = a;
//            if (b > a) c = b;
//            System.out.println(c);
//       }
//    }

/*
ТЕРНАРНЫЙ ОПЕРАТОР
 */
//public class Control_structures{
//    public static void main(String[] args) {
//        int a = 1;
//        int b = 2;
//        int min = a < b ? a : b;
//        System.out.println(min);
//    }
//}

/*
ОПЕРАТОР ВЫБОРА
 */

//import java.util.Scanner;
//public class Control_structures.{
//    public static void main(String[] args) {
//        int mounth = value;
//        String text = "";
//        switch (mounth) {
//            case 1:
//                text = "Autumn";
//                break;
//...
//            default:
//                text = "mistake";
//                break;
//        }
//        System.out.println(text);
//        iScanner.close();
//    }
//}
package lection_1;
/*
ФОРМАТИРОВАННЫЙ ВЫВОД
 */
public class Formatted_output {
    public static void main(String[] args) {
        int a = 1, b = 2;
        int c = a + b;
        String res = a + " + " + b + " = " + c;
        System.out.println(res);
    }
}


//public class Formatted_output {
//    public static void main(String[] args) {
//        int a = 1, b = 2;
//        int c = a + b;
//        String res = String.format("%d + %d = %d \n", a, b, c);
//        System.out.printf("%d + %d = %d \n", a, b, c);
//        System.out.println(res);
//    }
//}

//     public class Formatted_output {
//        public static void main(String[] args) {
//            float pi = 3.1415f;
//            System.out.printf("%f\n", pi); // 3,141500
//            System.out.printf("%.2f\n", pi); // 3,14
//            System.out.printf("%.3f\n", pi); // 3,141
//            System.out.printf("%e\n", pi); // 3,141500e+00
//            System.out.printf("%.2e\n", pi); // 3,14e+00
//            System.out.printf("%.3e\n", pi); // 3,141e+00
//        }
//    }
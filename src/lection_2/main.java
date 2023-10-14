package lection_2;
/*
ДОБАВИТЬ 1000000 +
 */
//public class main {
//    public static void main(String[] args) {
//        String str = "";
//        for (int i = 0; i < 1000000; i++) {
//            str += "+";
//        }
//    }
//}   // КОД ВЫПОЛНЯЕТСЯ ОЧЕНЬ ДОЛГО

public class main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("+");
        }
    }
}  // КОД ВЫПОЛНЯЕТСЯ ОЧЕНЬ БЫСТРО
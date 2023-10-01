package lection_1;
/*
НЕЯВНАЯ ТИПИЗАЦИЯ
 */
public class Impilicit_types {
        public static void main(String[] args) {
            var a = 123;
            System.out.println(a); // 123
            var d = 123.456;
            System.out.println(d); // 123.456
            System.out.println(getType(a)); // Integer
            System.out.println(getType(d)); // Double
            d = 1022;
            System.out.println(d); // 1022
//d = "mistake";
//error: incompatible types:
//String cannot be converted to double
        }
    static String getType(Object o){
        return o.getClass().getSimpleName();
    }
}


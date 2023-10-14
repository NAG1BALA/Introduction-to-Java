package seminar_2;
/*

 */
public class Task3 {
    /*
    Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом
    (возвращает boolean значение).
    Полиндром - Слово или фраза, которые одинаково читаются слева направо и справа налево.
     */
    public static void main(String[] args) {
        String s = "Потоп";
        System.out.println(polindromV2(s));
    }

    static boolean polindromV1(String s){
        s = s.toLowerCase();
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }

    static boolean polindromV2(String s){
        s = s.toLowerCase();
        StringBuilder stringBuilder1 = new StringBuilder(s);
        String s1 = stringBuilder1.reverse().toString();
        return s.equals(s1);
    }
}
package seminar_1;

public class Task4 {
    /*
    Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
     */
    public static void main(String[] args) {
        String line = "Добро пожаловать на курс по Java";
        String[] words = line.split(" ");
        String line2 = "";
        for (int i = words.length - 1; i >= 0; i--) {
            line2 += words[i];
            line2 += " ";
        }
        System.out.println(line2.trim());
    }


}

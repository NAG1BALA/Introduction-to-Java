package seminar_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task4 {
    /*
    Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
    что на 0й позиции каждого внутреннего списка содержится название жанра,
    а на остальных позициях - названия книг. Напишите метод для заполнения данной структуры.
    [
        ["роман", "война и мир", ...],
        ["сказки", "колобок", "золотая рыбка", "царевна лягушка"],
        ["фентези", "гарри поттер"]
    ]
    */
    public static void main(String[] args) {
        List<List<String>> shopBook = new ArrayList<>();
        addBook(shopBook, "фентези", "гарри поттер");
        addBook(shopBook, "сказки", "колобок");
        addBook(shopBook, "роман", "война и мир");
        addBook(shopBook, "сказки", "царевна лягушка");
        addBook(shopBook, "сказки", "золотая рыбка");

        System.out.println(shopBook);
    }

    static void addBook(List<List<String>> shopBook, String genre, String nameBook){
        for (int i = 0; i < shopBook.size(); i++) {
            if (shopBook.get(i).get(0).equals(genre)){
                if (!shopBook.get(i).contains(nameBook)){
                    List<String> list = shopBook.get(i);
                    list.add(nameBook);
                }
                return;
            }
        }
        List<String> list = new ArrayList<>();
        list.add(genre);
        list.add(nameBook);
        shopBook.add(list);
    }
}


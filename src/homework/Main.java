package homework;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        System.out.println("Добро пожаловать, Константин!");

        Map <Integer, Integer> memories = new HashMap<>();
        Map <Integer, Integer> hdds = new HashMap<>();
        Map <Integer, String> oss = new HashMap<>();
        Map <Integer, String> colours = new HashMap <>();

        Notebook.fillMemories(memories);
        Notebook.fillHdds(hdds);
        Notebook.fillOss(oss);
        Notebook.fillColours(colours);

        // Создаем список ноутбуков со случайными характеристиками. Т.к. это Set, все ноутбуки разные.
        Set <Notebook> allNotebooks = new HashSet<>();
        for (int i = 1; i <= 30; i++) {
            Notebook element = Notebook.generateNotebook(memories, hdds, oss, colours);
            // Вывод полного списка убрал, т.к. в идеале должны быть показаны только выбранные пользователем по характеристикам
            // System.out.println(element);
            allNotebooks.add(element);
        }

        int minMemory = 1;
        int minHdd = 1;
        String userOs = "0";
        String userColour = "0";

        int d = 0;
        while (d == 0) {
            System.out.println("Выберите параметры: ");
            System.out.println("1 - объем оперативной памяти");
            System.out.println("2 - объем жесткого диска");
            System.out.println("3 - операционная система");
            System.out.println("4 - цвет");
            System.out.println("Если Вы закончили с выбором интересующих Вас параметров, нажмите 5");

            Scanner sc = new Scanner(System.in);
            int point = 0;
            try {
                point = Integer.parseInt(sc.nextLine());
                switch (point) {
                    case 1:
                        System.out.println("Выберите минимальный объем оперативной памяти:");
                        System.out.println("1 - 8 Gb");
                        System.out.println("2 - 16 Gb");
                        System.out.println("3 - 32 Gb");
                        System.out.println("4 - 64 Gb");
                        String userMemory = sc.nextLine();
                        try {
                            minMemory = Integer.parseInt(userMemory);
                            if (minMemory < 1 || minMemory > 4) {
                                minMemory = 1;
                                System.out.println("Неверное значение.");
                            }
                        } catch (NumberFormatException ex) {
                            System.out.println("Вы ввели не число.");
                        }
                        break;

                    case 2:
                        System.out.println("Выберите минимальный объем жесткого диска:");
                        System.out.println("1 - 512 Gb");
                        System.out.println("2 - 1024 Gb");
                        System.out.println("3 - 2048 Gb");

                        String userHdd = sc.nextLine();
                        try {
                            minHdd = Integer.parseInt(userHdd);
                            if (minHdd < 1 || minHdd > 3) {
                                minHdd = 1;
                                System.out.println("Неверное значение.");
                            }
                        } catch (NumberFormatException ex) {
                            System.out.println("Вы ввели не число.");
                        }
                        break;

                    case 3:
                        System.out.println("Выберите операционную систему");
                        System.out.println("1 - Windows");
                        System.out.println("2 - FreeDos");
                        System.out.println("3 - без операционной системы");
                        System.out.println("4 - Linux");
                        System.out.println("5 - MacOs");
                        String indexOs = sc.nextLine();
                        try {
                            int choiceOs = Integer.parseInt(indexOs);
                            if (choiceOs < 1 || choiceOs > 5) {
                                choiceOs = 1;
                                System.out.println("Неверное значение.");
                            }
                            else userOs = oss.get(choiceOs);
                        } catch (NumberFormatException ex) {
                            System.out.println("Вы ввели не число.");
                        }
                        break;

                    case 4:
                        System.out.println("Выберите цвет");
                        System.out.println("1 - red");
                        System.out.println("2 - black");
                        System.out.println("3 - silver");
                        System.out.println("4 - white");
                        String indexColour = sc.nextLine();
                        try {
                            int choiceColour = Integer.parseInt(indexColour);
                            if (choiceColour < 1 || choiceColour > 4) {
                                choiceColour = 1;
                                System.out.println("Неверное значение.");
                            }
                            else userColour = colours.get(choiceColour);
                        } catch (NumberFormatException ex) {
                            System.out.println("Вы ввели не число.");
                        }
                        break;

                    case 5:
                        d = 1;
                        sc.close();
                        break;

                    default:
                        System.out.println("Вы ввели неверное значение. Попробуйте еще раз)");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Вы ввели не число.");
            }
        }

        // Применяем выбранный пользователем фильтр

        for (Notebook book : allNotebooks) {
            if (memories.get(minMemory) <= book.memory && hdds.get(minHdd) <= book.hdd && (userOs.equals("0") || book.os.equals(userOs)) && (userColour.equals("0") || book.colour.equals(userColour))){
                d = 2;
                System.out.println(book);
            }
        }
        if (d != 2) {
            System.out.println("Похоже, мы ничего не нашли. Попробуйте изменить условия поиска");
        }
    }
}
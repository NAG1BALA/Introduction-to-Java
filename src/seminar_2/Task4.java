package seminar_2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task4 {
    /*
    Напишите метод, который составит строку, состоящую из 100 повторений слова TEST
    и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
     */
    static Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) {
        String filePath = "src/lesson2/seminar/test.txt";
        String logPath = "src/lesson2/seminar/log.txt";
        String s = "Hello";
        int n = 5;

        createLogger(logPath);
        String line = repeat(s, n);
        writeToFile(line, filePath);
        closeLogger();
        System.out.println("Конец работы приложения");
    }

    static String repeat(String s, int n){
        return s.repeat(n);
    }

    static void createLogger(String logPath){
        try {
            FileHandler fileHandler = new FileHandler(logPath, true);
            SimpleFormatter simpleFormatter = new SimpleFormatter();
            fileHandler.setFormatter(simpleFormatter);
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void closeLogger(){
        Handler[] handlers = logger.getHandlers();
        for (Handler handler: handlers){
            handler.close();
        }
    }

    static void writeToFile(String line, String filePath) {
        try (FileWriter writer = new FileWriter(filePath, true)){
            writer.write(line);
            writer.write("\n");
            writer.flush();
            logger.info("Запись выполнена успешно");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Запись в файл не удалась");
            logger.warning("Запись в файл не удалась");
        }
    }
}

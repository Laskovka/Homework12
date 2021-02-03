package ua.com.alevel;

import java.io.*;

public class Demo {
    public static String read(String path) {
        //открываем файл по пути
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String currentString;
            //построчно считываем файл
            while ((currentString = reader.readLine()) != null) {
                stringBuilder.append(currentString);
                stringBuilder.append("\n");
            }
            //возвращаем вычитанный текст в строке
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("FileNotFoundException - " + fileNotFoundException.getMessage());
        } catch (IOException ioException) {
            System.out.println("IOException - " + ioException.getMessage());
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(read("C:\\test.txt"));
        //1. FileNotFoundException
        System.out.println(read("C:\\test1.txt"));
    }
}

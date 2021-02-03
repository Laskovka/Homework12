package ua.com.alevel;

import java.io.*;

public class Demo {
    public static String read(String path) {
        //открываем файл по пути
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        StringBuilder stringBuilder = new StringBuilder();
        String currentString = null;
        //построчно считываем файл
        while (true) {
            try {
                if (!((currentString = reader.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            stringBuilder.append(currentString);
            stringBuilder.append("\n");
        }
        //закрываем файл
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //возвращаем вычитанный текст в строке
        return stringBuilder.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(read("C:\\test.txt"));
        //1. FileNotFoundException
        System.out.println(read("C:\\test1.txt"));
    }
}

package ru.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        // создание класса для сохранения полученной инфомации об отрезках маршрута
        Path inputPath = new Path();

        // считывание данных
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        // в первой строке хранится количество отрезков
        String firstLine = reader.readLine();
        int n = Integer.parseInt(firstLine);
        // считывание вводимых данных и сохранение в классе
        for (int i = 0; i < n; i++) {
            String[] linePath = reader.readLine().split(" ");
            inputPath.putPairPoints(linePath[0], linePath[1]);
        }
        reader.close();

        // Получение маршрута в правильном порядке
        ArrayList<String> route = inputPath.getRoute();

        // Вывод результата
        if (route.isEmpty()) {
            System.out.println("Route is Empty");
        } else {
            for (int i = 0; i < route.size(); i++) {
                System.out.print(route.get(i));
                System.out.print(" ");
            }
        }
    }
}

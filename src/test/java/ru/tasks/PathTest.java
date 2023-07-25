package ru.tasks;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PathTest {
    // на тех примерах, что даны в задании

    @Test
    void getRouteOne() {
        Path inputPath = new Path();
        inputPath.putPairPoints("Moscow", "Izhevsk");
        inputPath.putPairPoints("Sochi", "Moscow");
        ArrayList<String> route = inputPath.getRoute();

        ArrayList<String> expectedResult = new ArrayList<>();
        expectedResult.add("Sochi");
        expectedResult.add("Moscow");
        expectedResult.add("Izhevsk");

        assertTrue(route.equals(expectedResult));
    }

    @Test
    void getRouteTwo() {
        Path inputPath = new Path();
        inputPath.putPairPoints("Москва", "Тюмень");
        inputPath.putPairPoints("Тюмень", "Сочи");
        inputPath.putPairPoints("Ростов-на-Дону", "Москва");

        ArrayList<String> route = inputPath.getRoute();

        ArrayList<String> expectedResult = new ArrayList<>();
        expectedResult.add("Ростов-на-Дону");
        expectedResult.add("Москва");
        expectedResult.add("Тюмень");
        expectedResult.add("Сочи");

        assertTrue(route.equals(expectedResult));
    }
}
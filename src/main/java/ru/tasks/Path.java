package ru.tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Path class
 * @author Galiandina Olga
 */
public class Path {
    private final HashMap<String, String> routePoints;
    private final HashSet<String> startPoints;
    private final HashSet<String> endPoints;

    /**
     * Constructor
     * Initializing of variables
     */
    public Path() {
        routePoints = new HashMap<>();
        startPoints = new HashSet<>();
        endPoints = new HashSet<>();
    }

    /**
     * Fill hashMap routePoints
     * fill hashSets endPoints and startPoints
     * delete from set startPoints points, which are in set endPoints
     * after filling in set startPoint will be only one point, which is start point
     * @param start
     * @param end
     */
    public void putPairPoints(String start, String end) {
        routePoints.put(start, end);
        endPoints.add(end);
        if (startPoints.contains(end)) startPoints.remove(end);
        if (!endPoints.contains(start)) startPoints.add(start);
    }

    /**
     * getting route that contains name of cities in order from start to end
     * @return ArrayList<String> route
     */
    public ArrayList<String> getRoute() {
        ArrayList<String> route = new ArrayList<>();
        if (!startPoints.isEmpty()) {
            String start = startPoints.iterator().next();
            route.add(start);
            for (int i = 0; i < routePoints.size(); i++) {
                route.add(routePoints.get(start));
                start = routePoints.get(start);
            }
        }
        return route;
    }
}

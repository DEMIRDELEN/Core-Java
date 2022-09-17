package day48_Maps_TheEnd;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03_Compute {
    public static void main(String[] args) {
        Map<String, Integer> harfMapi = new HashMap<>();

        harfMapi.put("A", 3);
        harfMapi.put("B", 1);
        harfMapi.put("C", 2);
        harfMapi.put("D", 4);
        harfMapi.put("E", 4);

        System.out.println(harfMapi);

        harfMapi.compute("A", (k, v) -> v * 2 + 3);
        harfMapi.compute("D", (a, b) -> b * b);
        harfMapi.computeIfAbsent("F", (v) -> 30);
        harfMapi.computeIfPresent("C", (k,v) -> 30);
        harfMapi.computeIfPresent("E", (k,v)-> v+5);

        System.out.println(harfMapi);
    }
}

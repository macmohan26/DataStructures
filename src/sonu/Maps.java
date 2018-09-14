package sonu;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

    public static void main(String[] args) {
        // Implement map interfaces
        Map<Integer, String> hmap = new TreeMap<Integer, String>();
        mapUtil(hmap);
    }

    private static void mapUtil(Map<Integer, String> map) {
        // 1. Add Key-Value Pairs
        map.put(101, "Steve");
        map.put(502,"Roger");
        map.put(22,"jennifer");
        map.put(315,"Mika");
        map.put(36,"Ellie");
        map.put(750,"Kelly");

        // 2. Expose / access elements
        System.out.println("See all the keys: " + map.keySet());
        System.out.println("see all the key-value pairs: " + map);
        System.out.println(map.get(502));

        // 3. Iterate through map of key-value pairs?
        for (int key : map.keySet()){
            System.out.println("[KEY: " + key + ". VALUE:" + map.get(key) + " ]");
        }

    }


}

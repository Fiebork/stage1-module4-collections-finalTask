package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> map = new HashMap<>();
        if (sourceMap.size() == 0) {
            return map;
        }
        List<String> list = new ArrayList<>(sourceMap.keySet());

        list.sort(Comparator.comparingInt(String::length));

        Set<String> temp = new HashSet<>();
        int defaultLength = list.get(0).length();

        for (String s : list) {
            if (s.length() != defaultLength) {
                map.put(defaultLength, new HashSet<>(temp));
                temp.clear();
                defaultLength = s.length();
            }
            temp.add(s);
        }
        map.put(defaultLength, temp);
        return map;
    }
}

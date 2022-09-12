package com.epam.mjc.collections.combined;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> list = new ArrayList<>();

        for (Set <String> elem : projects.values()) {
            if (elem.contains(developer)) {
                for (String el : projects.keySet()) {
                    if (projects.get(el) == elem) {
                        list.add(el);
                    }
                }
            }
        }

        return list;
    }
}

package com.nanda.problem.solving.array;

import java.util.ArrayList;
import java.util.List;

public class CountMatchingItem {

    class Item {

        private String type;
        private String color;
        private String name;

        public  Item(String type,  String color, String name) {
            this.type = type;
            this.color = color;
            this.name = name;
        }

        public boolean isMataching(String key, String value) {
            if (key.equals("color")) {
                return this.color.equals(value);
            } else if (key.equals("type")) {
                return this.type.equals(value);
            } else if (key.equals("name")) {
                return this.name.equals(value);
            } else {
                return false;
            }
        }

    }


    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int matchedCount = 0;

        List<Item> devices = new ArrayList<>();


        for (int i = 0; i < items.size(); i++) {
            devices.add(new Item(items.get(i).get(0), items.get(i).get(1), items.get(i).get(2)));
        }


        for (int i = 0; i < devices.size(); i++) {
            matchedCount = devices.get(i).isMataching(ruleKey, ruleValue) ? ++matchedCount : matchedCount;
        }

        return matchedCount;

    }


    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(new ArrayList<>(List.of(new String[]{"phone", "blue", "pixel"})));
        items.add(new ArrayList<>(List.of(new String[]{"computer","silver","lenovo"})));
        items.add(new ArrayList<>(List.of(new String[]{"phone","gold","iphone"})));
        new CountMatchingItem().countMatches(items, "color", "silver");
    }



}


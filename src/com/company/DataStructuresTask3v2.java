package com.company;

import java.util.*;
import java.util.stream.Collectors;


public class DataStructuresTask3v2 {

    public static void main(String[] args) {

        HashMap<String, Double> products = new HashMap<>();
        products.put("Peanut Butter", 3.09);
        products.put("Bananas", 0.73);
        products.put("Hummus", 0.98);
        products.put("Strawberries", 6.55);
        products.put("Salmon", 2.99);
        products.put("Sesame oil", 5.39);
        products.put("Pineapple", 3.95);
        products.put("Almond milk", 1.57);
        products.put("Eggs", 2.49);
        products.put("Cheese", 1.99);
        products.put("White wine", 4.95);

        for (Map.Entry list : products.entrySet()) {
            System.out.println(list.getValue() + " " + list.getKey()); //print the product list
        }
        System.out.println();

        Map.Entry<String, Double> minPrice = Collections.min(products.entrySet(),
                Map.Entry.comparingByValue()); //lowest price
        System.out.println("Lowest price: " + minPrice + " eur");

        Map.Entry<String, Double> maxPrice = Collections.max(products.entrySet(),
                Map.Entry.comparingByValue());//highest price
        System.out.println("Highest price: " + maxPrice + " eur");

//        System.out.println(Collections.min(products.values())); //lowest price
//        System.out.println(Collections.max(products.values())); //highest price


        int count = 0; // under 1 eur
        for (Double price : products.values()) {
            if (price < 1) {
                count++;
            }
        }
        System.out.println("How many products are under 1 eur? " + count);

        HashMap<String, Double> otherProducts = new HashMap<>(); //new HashMap with other products
        otherProducts.put("Lentils", 2.19);
        otherProducts.put("Walnuts", 2.59);
        otherProducts.put("Edamame beans", 1.35);
        otherProducts.put("Bread", 0.79);
        otherProducts.put("Chocolate", 1.49);
        otherProducts.put("Smoothie", 0.99);
        otherProducts.put("Macadamia nuts", 3.29);
        otherProducts.put("Butter", 1.89);
        otherProducts.put("Dijon mustard", 0.89);
        System.out.println();

        //merge both. Question - if price is the same - first one eliminated
        products.putAll(otherProducts);
        System.out.println("Merged product list");
        for (Map.Entry list : products.entrySet()) {
            System.out.println(list.getValue() + " " + list.getKey()); //print the product list
        }
        System.out.println();

        //print how many products in the merged map
        System.out.println("How many products in the merged list? " + products.size());
        System.out.println();

        //sort the merged map
        System.out.println("Sorted in ascending order:");
        List<Map.Entry<String, Double>> sorted = products.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());
        System.out.println(sorted);
        System.out.println();

        System.out.println("Sorted in ascending order complicated way:");
        Map<String, Double> sorted2 = sortByValue(products);
        for (Map.Entry<String, Double> list : sorted2.entrySet()) {
            System.out.println(list.getValue() + " " + list.getKey());
        }

    }

    public static HashMap<String, Double> sortByValue(HashMap<String, Double> products) {

        // Create a list from elements of HashMap
        List<Map.Entry<String, Double>> listOfProducts = new LinkedList<>(products.entrySet());

        // Sort the list
        listOfProducts.sort(Map.Entry.comparingByValue());

        // put data from sorted list to hashmap
        HashMap<String, Double> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Double> map : listOfProducts) {
            sortedMap.put(map.getKey(), map.getValue());
        }
        return sortedMap;
    }

}


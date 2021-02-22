package com.company;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class DataStructuresTask3 {

    public static void main (String[] args) {
        productList();

    }
    public static void productList () {

        HashMap<Double,String> products = new HashMap<>();
        products.put(3.09,"Peanut Butter");
        products.put(0.73,"Bananas");
        products.put(0.98,"Hummus");
        products.put(6.55,"Strawberries");
        products.put(2.99,"Salmon");
        products.put(5.39,"Sesame oil");
        products.put(3.95,"Pineapple");
        products.put(1.57,"Almond milk");
        products.put(2.49,"Eggs");
        products.put(1.99,"Cheese");
        products.put(4.95,"White wine");

        for(Map.Entry list : products.entrySet()) {
            System.out.println(list.getKey() + " " + list.getValue()); //print the product list
        }
        System.out.println();

        Double minPrice = Collections.min(products.keySet()); //lowest price
        System.out.println("Lowest price: " + products.get(minPrice) + " " + minPrice + " eur");
        Double maxPrice = Collections.max(products.keySet()); //highest price
        System.out.println("Highest price: " + products.get(maxPrice) + " " + maxPrice + " eur");

        int count = 0; // under 1 eur
        for (Double price : products.keySet()) {
            if (price < 1) {
                count++;
            }
        }
        System.out.println("How many products are under 1 eur? " + count);

        HashMap<Double, String> otherProducts = new HashMap<>(); //new HashMap with other products
        otherProducts.put(2.19,"Lentils");
        otherProducts.put(2.59,"Walnuts");
        otherProducts.put(1.35,"Edamame beans");
        otherProducts.put(0.79,"Bread");
        otherProducts.put(1.49,"Chocolate");
        otherProducts.put(0.99,"Smoothie");
        otherProducts.put(3.29,"Macadamia nuts");
        otherProducts.put(1.89,"Butter");
        otherProducts.put(0.89,"Dijon mustard");
        System.out.println();


//        System.out.println(otherProducts.isEmpty());
//        System.out.println(otherProducts.size());
//        System.out.println(otherProducts.values());
//        System.out.println(otherProducts.keySet());
//        System.out.println(otherProducts.hashCode());

        products.putAll(otherProducts); //merge both
        System.out.println("Merged product list");
        for(Map.Entry list : products.entrySet()) {
            System.out.println(list.getKey() + " " + list.getValue()); //print the product list

        }
        //print how many products in the merged map
        System.out.println("How many products in the merged list? " + products.size());
        System.out.println();

        System.out.println("Sorted in ascending order:");
        Map<Double, String> sortedProducts = new TreeMap<>(products); //sort the merged HashMap
        for (Map.Entry sort : sortedProducts.entrySet()){
            System.out.println(sort.getKey() + " " + sort.getValue());
        }
    }

}

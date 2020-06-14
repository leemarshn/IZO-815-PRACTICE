package com.company.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorClass {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Karen");
        cities.add("Langata");
        cities.add("Buruburu");
        cities.add("Donholm");
        cities.add("Thika");

        Iterator<String> listCities = cities.listIterator();

        while (listCities.hasNext()){
            String listedCities = listCities.next();
            System.out.println(listedCities);
        }
    }
}

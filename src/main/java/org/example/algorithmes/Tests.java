package org.example.algorithmes;

import java.util.*;

public class Tests {
    public static void main(String[] args) {
       LinkedHashMap<Integer, String> dsd = new LinkedHashMap<>();
       dsd.put(44, "andrei");
       dsd.put(41, "andrei1");
       dsd.put(28, "andrei1");
       for(Map.Entry<Integer, String> dd : dsd.entrySet()) {
           System.out.println(dd.getKey() + " " + dd.getValue());
       }
                List<String> dd = new ArrayList<>();
        dd.add("Andrei");
        dd.add("Andrei2");

//        Iterator iterator = dd.iterator();
//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());
//        iterator.remove();
//        System.out.println(dd.size());
        Collections.sort(dd);
        int a = Collections.binarySearch(dd, "Andrei2");
        System.out.println(a);
        ListIterator it = dd.listIterator();


    }
}

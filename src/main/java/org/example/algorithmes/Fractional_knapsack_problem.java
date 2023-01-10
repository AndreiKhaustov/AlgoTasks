package org.example.algorithmes;

import java.util.Arrays;
import java.util.Comparator;

public class Fractional_knapsack_problem {
    // Task about knapsack
    public static void main(String[] args) {
      final Item item1 = new Item(2, 14);
        final Item item2 = new Item(3, 18);
        final Item item3 = new Item(4, 20);
        /*
        1) Create objects items with method value per weight;
         */
        Item[] items = {item1, item2, item3};

        //O(n log n)
        Arrays.sort(items, Comparator.comparingDouble(Item::valuePerUnit).reversed());
        /*
        2) Sort with the biggest value in the beginning
         */
        System.out.println(Arrays.toString(items));
        int W = 7;
        int weightSoFar = 0;
       double valueSoFar = 0;
       int currentIndex = 0;
       while(currentIndex<items.length&&weightSoFar!=W){
          int freeSpace = W-weightSoFar;
          if(freeSpace-items[currentIndex].getWeight()>0) {
              valueSoFar += items[currentIndex].getWeight() * items[currentIndex].valuePerUnit();
              weightSoFar += items[currentIndex].getWeight();
          }
          else {
              valueSoFar += freeSpace * items[currentIndex].valuePerUnit();
              weightSoFar += freeSpace;
          }
          currentIndex++;
       }
       /*
       Count value using cycle
        */
        System.out.println(valueSoFar);
        System.out.println(weightSoFar);
    }

}
class Item {
        private int weight;
        private int value;
        public double valuePerUnit(){
            return value/(double)weight;
        }

    @Override
    public String toString() {
        return "Item{" +
                "weight=" + weight +
                ", value=" + value +
                '}';
    }

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}


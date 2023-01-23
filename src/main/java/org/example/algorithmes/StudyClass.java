package org.example.algorithmes;

import java.util.Arrays;
import java.util.Comparator;


public class StudyClass {


    public static void main(String[] args) {
        final OneItem item = new OneItem(2, 14);
        final OneItem item1 = new OneItem(3, 18);
        final OneItem item2 = new OneItem(4, 20);
        OneItem[] items = {item, item1, item2};
        double size = 7.0;
        double weightSoFar = 0.0;
        double valueSoFar=0.0;
        int index = 0;
        Arrays.sort(items, Comparator.comparingDouble(OneItem::getValuePerWeight).reversed());

        while (weightSoFar < size && index<items.length) {
            if(weightSoFar+items[index].getWeight()<=size) {
                valueSoFar += items[index].getValue();
                weightSoFar += items[index].getWeight();
            }
            else {
                valueSoFar += (size-weightSoFar)*items[index].getValuePerWeight();
                weightSoFar = size;
            }
          index++;
        }

        System.out.println(valueSoFar);
        System.out.println(weightSoFar);

    }
}

    class OneItem {
        private int weight;
        private int value;

        public OneItem(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }

        public double getValuePerWeight() {
            return value / (double) weight;
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




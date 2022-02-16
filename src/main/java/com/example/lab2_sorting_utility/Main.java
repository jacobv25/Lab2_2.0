package com.example.lab2_sorting_utility;

import com.example.lab2_sorting_utility.sorting_Algorithms.BubbleSort;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static BubbleSort<Integer> bubbleSort;
    static List<Integer> myList = new ArrayList<>();

    public static void main(String[] args) {
        myList.add(100);
        myList.add(90000);
        myList.add(45);
        myList.add(34);
        myList.add(90);
        myList.add(3);

        bubbleSort = new BubbleSort(myList);
        System.out.println(bubbleSort.sortList());
    }

}

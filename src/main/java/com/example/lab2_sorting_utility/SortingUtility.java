package com.example.lab2_sorting_utility;

import com.example.lab2_sorting_utility.sorting_Algorithms.BubbleSort;
import com.example.lab2_sorting_utility.sorting_Algorithms.QuickSort;

import java.util.List;

public class SortingUtility {
    public List<Product> sort(List<Product> items, int sortingApproach) {
        //is their choice is 1 then this will call the quickSort class
        if(sortingApproach == 0){
            BubbleSort bubbleSort = new BubbleSort(items);
            return bubbleSort.sortList();
        }
        //is their choice is 1 then this will call the BubbleSort class
        else if(sortingApproach == 1){
            QuickSort quicksort = new QuickSort();
            quicksort.quicksort(items,0 , items.size()-1);
            return items;
        }
        //if their choice is anything but number 0 and 1
        else{
            System.out.println("You chose an invalid entry");
            return items;
        }

    }
}

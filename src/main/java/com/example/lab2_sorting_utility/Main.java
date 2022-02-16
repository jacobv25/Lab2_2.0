package com.example.lab2_sorting_utility;

import com.example.lab2_sorting_utility.sorting_Algorithms.BubbleSort;
//import jdk.internal.icu.text.UnicodeSet;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static BubbleSort<Product> bubbleSort;
    static List<Product> myList = new ArrayList<>();

    public static void main(String[] args) {
        int temp = 0;
        Product product = new Product(0, "Gucci" ,230.99f );
        Product product1 = new Product(1, "LV" ,500f );
        Product product2 = new Product(2, "CSUSM" ,23000000.99f );
        Product product3 = new Product(3, "SDSU" ,5000000.01f );
        Product product4 = new Product(4, "Jacob" ,99.99f );
        Product product5 = new Product(5, "barf" ,1.99f );

        myList.add(product5);
        myList.add(product1);
        myList.add(product);
        myList.add(product4);
        myList.add(product2);
        myList.add(product3);



        //bubbleSort = new BubbleSort(myList);
        //System.out.println(bubbleSort.sortList());

        SortingUtility sortingutility= new SortingUtility();
        System.out.println(sortingutility.sort(myList,temp));


    }

}

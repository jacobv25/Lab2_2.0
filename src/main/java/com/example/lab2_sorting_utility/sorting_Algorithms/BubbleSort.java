package com.example.lab2_sorting_utility.sorting_Algorithms;

import java.util.List;

public class BubbleSort <T extends Comparable<? super T>> {
    /*
    void bubbleSort(T ar[], int n) {
        boolean done = false;//setting done equal to false
        T temp;// to hold a temporary variable
        while (!done) {
            done = true;
            for (int i = 0; i < n - 1; i++) {
                if (ar[i] < ar[i + 1]) {
                    temp = ar[i + 1];
                    ar[i + 1] = ar[i];
                    ar[i] = temp;
                    done = false;
                }

            }
        }
    }
}
*/
List<T> list;

    public BubbleSort(List<T> list) {
        this.list = list;
    }

    //public BubbleSort() {

    //}

    public List<T> sortList() {
        for (int i = list.size(); i > 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                //if greater swap elements
                if (list.get(j).compareTo(list.get(j+1)) > 0) {
                    swapElements(j, list);
                }
            }
        }
        return list;
    }

    private void swapElements(int index, List<T> list) {
        T temp = list.get(index);
        list.set(index, list.get(index + 1));
        list.set(index + 1, temp);
    }

}
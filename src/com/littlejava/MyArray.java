package com.littlejava;

public class MyArray {
    private int l = 0;
    private int index = 0;
    private int[] arr = new int[20];
    private int max;
    public void add (int value) {
        arr[index] = value;
        l++;
        index++;
    }
    public int length () {
        return l;
    }
    public int max () {
        max = arr[0];
        for (int i = 1; i < l; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
    public void sort () {
        for(int i = 0; i < l; i++){

            for(int j = i + 1; j < l; j++){

                if (arr[i] > arr[j]){

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public int[] output () {
        int[] newArr = new int[l];

        for(int i = 0; i < l; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}

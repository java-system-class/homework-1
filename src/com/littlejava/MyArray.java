package com.littlejava;

public class MyArray {

    private int[] array = {};

    public int[] output() {
        return this.array;
    }

    public void add(int newVal) {
        int[] newArray = new int[this.array.length + 1];
        for (int i = 0; i < this.array.length; i++) {
            newArray[i] = this.array[i];
        }
        newArray[newArray.length - 1] = newVal;
        this.array = newArray;
    }

    public void sort() {
        int temp;
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array.length - 1 - i; j++) {
                if (this.array[j] > this.array[j + 1]) {
                    temp = this.array[j];
                    this.array[j] = this.array[j + 1];
                    this.array[j + 1] = temp;
                }
            }
        }
    }


    public int max() {
        int max = 0;
        for (int member : this.array) {
            if (member > max) {
                max = member;
            }
        }
        return max;
    }
}

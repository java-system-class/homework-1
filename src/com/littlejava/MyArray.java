package com.littlejava;

import java.util.Arrays;

public class MyArray {
    int[] arr = new int[0];
    int mid;
    public int[] add(int x){
        int[] teparr = new int[arr.length+1];
        System.arraycopy(arr,0,teparr,0,arr.length);
        teparr[arr.length] = x;
        arr = teparr;
        return   arr;
    }
    public int[] sort(){
        for ( int i=0; i < arr.length; i++ ){

            for ( int j=0; j < arr.length-1-i; j++ ){
                if(arr[j]>arr[j+1]){
                    mid = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = mid;
                }

            }
        }
        return arr;
    }
    public int max(){
        int max = arr[0];
        for ( int i=1; i < arr.length; i++ ){

            if( arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public int length(){
        return arr.length;
    }
    public int[] output(){
        
        int[] outarr = new int[arr.length];
        System.arraycopy(arr,0,outarr,0,arr.length);

        return   outarr;
    }
}

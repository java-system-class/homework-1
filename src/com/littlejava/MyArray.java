package com.littlejava;

public class MyArray {
    int len=10;
    int[] array=new int[len];

    //添加到数组
    int j=0;
    public void add(int value){

        array[j] = value;
        System.out.println(array[j]);
        j++;

    }
    //获取最大值
    public int max(){
        int max=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("最大值："+max);
        return max;

    }
    //从小到大排
    public int[] sort(){

        for(int i = 0 ; i < array.length ; i ++) {
            for(int j = i +1 ; j < array.length ; j ++) {
                if(array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i = 0 ; i < array.length ; i ++) {
            System.out.print(array[i]+"，");
        }
        return array;
        //1，2，3，4，5，6，7，8，9，10，[I@60e53b93
        //ALEX老师请问最后打印的是什么？
    }
    //获取内部数组
    public int[] output(){
        int[] newArray=new int[len];//创建新数组
        for(int i=0;i<newArray.length;i++){
            newArray[i]=array[i];
        }
        return newArray;

    }

    //1、public int[]和public int的区别，max方法我用int 后面两个用的是int[] 好像都可以 不传值时，用return 返回。
    //2、void 和static void 的区别  传值时，用void?
}

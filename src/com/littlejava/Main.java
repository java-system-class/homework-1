package com.littlejava;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, homework 1.");

        // 对于每个问题，新建一个类，并且实现相应的方法，然后满足问题的要求，同时要求程序此程序能够运行通过

        // 注：assert(expression) 的意思是判断expression是否为真，这是用于测试你实现的代码是否正确

        // 问题一: 一元二次多项式的计算
        QuadPolynomial quadPolynomial = new QuadPolynomial();
        quadPolynomial.a = 3;
        quadPolynomial.b = 2;
        quadPolynomial.c = 5;
        assert(quadPolynomial.result(3) == 38);

        // 问题二：实现一个整数数组类 MyArray, 里面包含一个数组， 有5种操作：
        // 1. 添加一个整数到数组中，例：myArray.add(5)
        // 2. 从小到大排序, 例：myArray.sort()
        // 3. 获取数组最大值, 例：myArray.max()
        // 4. 获取数组长度, 例：myArray.length()
        // 5. 获取内部的数组, 返回一个数组, 例：int[] output = myArray.output()
        // 注：在java中定义一个整数数组的语法: int[] array = new int[20];
        // java遍历一个数组的语法：for (int i = 0; i < array.size(); i++) System.out.print(array[i])

        MyArray myArray = new MyArray();
        myArray.add(3);
        myArray.add(1);
        myArray.add(5);
        myArray.add(8);
        myArray.add(4);
        myArray.add(9);
        myArray.add(2);
        myArray.add(7);

        assert(myArray.max() == 9);

        myArray.add(10);
        assert(myArray.max() == 10);

        myArray.sort();
        int[] output = myArray.output();
        for (int i = 1; i <= 10; i++) {
            assert(output[i] == (i + 1));
        }
    }
}

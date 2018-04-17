package com.littlejava;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, this is Yigga's homework");
        QuadPolynomial quadPolynomial = new QuadPolynomial();
        quadPolynomial.a = 3;
        quadPolynomial.b = 2;
        quadPolynomial.c = 5;

        assert(quadPolynomial.result(3) == 38);

        MyArray myArray = new MyArray();

        myArray.add(3);
        myArray.add(1);
        myArray.add(5);
        myArray.add(8);
        myArray.add(4);
        myArray.add(6);
        myArray.add(9);
        myArray.add(2);
        myArray.add(7);

        assert(myArray.max() == 9);

        myArray.add(10);

        assert(myArray.max() == 10);

        myArray.sort();

        int[] output = myArray.output();

        for (int i = 0; i < 10; i++) {

            System.out.println(output[i]);

            assert(output[i] == (i));
        }
    }
}

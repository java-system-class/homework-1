package com.littlejava;

public class QuadPolynomial {
    public int a, b, c;

    public int result(int x) {
        return a * x * x + b * x + c;
    }
}

package com.littlejava;

//一元二次多项式
//f(x)=ax²+bx+c
public class QuadPolynomial {
    public int a,b,c;
    public int result(int x){
        return a*x*x+b*x+c;
    }
}

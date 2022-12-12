package org.cs.Leetcode;

/*
* @author ZQR0
* @param int x - input integer
* @return square root of input integer
* Algorithm to get a square root of int x*/
public class SqrtX {
    public int mySqrt(int x) {
        if(x==1) {
            return 1;
        }

        int e = x/2;
        int s = 0;
        int p =0 ;

        while(e>=s) {
            p = (e-s)/2 + s;
            if((long)p*p == (long)x) {
                return p;
            }
            else if((long)p*p < (long)x) {
                s = p+1;
            }
            else {
                e = p-1;
            }
        }

        return e;
    }
}

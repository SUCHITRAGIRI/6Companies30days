//https://leetcode.com/problems/greatest-common-divisor-of-strings/

package com.example.test;

public class GreatestCommonDivisorOfString {
    public static void main(String[] args) {
        String str1 = "ABABAB";
        String str2 = "ABAB";

        System.out.println(gcdOfStrings(str1, str2));
    }
    static public String gcdOfStrings(String str1, String str2) {

        if(!(str1 + str2).equals(str2 + str1))return "";

        int gcdVal = gcd(str1.length(), str2.length());
        return str2.substring(0, gcdVal);

    }
    static public int gcd(int p, int q){
        if(q == 0)return p;

        else return gcd(q, p % q);

    }
}

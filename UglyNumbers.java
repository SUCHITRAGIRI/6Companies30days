//https://practice.geeksforgeeks.org/problems/ugly-numbers2254/1/#
//time : O(N * logn) where n is the number
//Time linit exceed! and also giving wrong ans in some TCs!

package com.example.test;

import java.util.HashSet;
import java.util.PriorityQueue;

public class UglyNumbers {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(getNthUglyNo(n));
    }
    static long getNthUglyNo(int n) {
   HashSet<Long> set = new HashSet<>();
   PriorityQueue<Long> pq = new PriorityQueue<>();
   int i = 1;
   long res = 1;
   while(i < n){
       pq.add(res * 2);
       pq.add(res * 3);
       pq.add(res * 5);
       set.addAll(pq);
       pq.clear();
       pq.addAll(set);
       res = pq.poll();
       set.clear();
       i++;
   }
        System.out.println(set.toString());
        System.out.println(pq.toString());
   return res;
    }
}

// Time : O(N)
// Space : O(N)
class Solution {
    public int nthUglyNumber(int n) {
        
    int factor2 = 2, factor3 = 3, factor5 = 5;
    int index2 = 0, index3 = 0, index5 = 0;
        
    int[] ugly = new int[n];
    ugly[0] = 1;
        
    for(int i = 1; i < n; i++){
        int min = Math.min(factor2, Math.min(factor3, factor5));
        ugly[i] = min;
        if(factor2 == min){
            factor2 = 2 * ugly[++index2];
        }
         if(factor3 == min){
            factor3 = 3 * ugly[++index3];
        }
         if(factor5 == min){
            factor5 = 5 * ugly[++index5];
        }
    } 
        return ugly[n - 1];
}
}



//https://practice.geeksforgeeks.org/problems/ugly-numbers2254/1/#
//time : O(N * logn) where n is the number
//Time linit exceed!

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



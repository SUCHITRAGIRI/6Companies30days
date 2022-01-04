// Leetcode
//https://leetcode.com/problems/decode-ways/
//time : O(N), where N is the string length
class Solution {
    public int numDecodings(String str) {
         if(str.length() == 0 || str.charAt(0) == '0')return 0;
        if(str.length() == 1)return 1;
        
        int count1  = 1, count2 = 1;
        for(int i = 1; i < str.length(); i++){
            int d = str.charAt(i) - '0';
            int dd = (str.charAt(i - 1) - '0')*10 + d;
            int count = 0;
            if(d > 0)count += count2;
            if(dd >= 10 && dd <= 26)count += count1;
            count1 = count2;
            count2 = count;
        }
        return count2;
    }
}

//Geeks for geeks
//https://practice.geeksforgeeks.org/problems/total-decoding-messages1235/1/#
//time : O(N)
class Solution
{
    public int CountWays(String str)
    {
        if(str.length() == 0 || str.charAt(0) == '0')return 0;
        if(str.length() == 1)return 1;
        
        int count1  = 1, count2 = 1;
        for(int i = 1; i < str.length(); i++){
            int d = str.charAt(i) - '0';
            int dd = (str.charAt(i - 1) - '0')*10 + d;
            int count = 0;
            if(d > 0)count += count2;
            if(dd >= 10 && dd <= 26)count += count1;
            count1 = count2 % 1000000007;
            count2 = count % 1000000007;
        }
        return count2;
    }
    
}

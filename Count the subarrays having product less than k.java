
// My brutr force soln, its giving me TLE
// Tc : O(N^2)
public int countSubArrayProductLessThanK(long a[], long n, long k)
    {
        int count = 0;
        long mul = 0;

        for(int i = 0; i < n; i++){
            mul = a[i];
            if(mul < k){
                count++;
            }
            else continue;
            for (int j = i + 1; j < n; j++){
                mul *= a[j];
                if(mul < k)count++;
                else break;
            }
        }
       return count;
    }

//Optimized code with sliding window technique!
// time : O(N)

class Solution {
    
    public int countSubArrayProductLessThanK(long a[], long n, long k)
    {
        int count = 0;
        long mul = 1;
        int j = 0;
        
        for(int i = 0; i < n; i++){
            mul *= a[i];
            while(j < n && mul >= k){
                mul /= a[j];
                j++;
            }
            count += (i - j + 1); 
        }
       return count;
    }
}

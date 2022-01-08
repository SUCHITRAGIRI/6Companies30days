//https://practice.geeksforgeeks.org/problems/squares-in-nn-chessboard1801/1#
//Time : O(N), space : O(1)
class Solution {
    static Long squaresInChessBoard(Long N) {
        long ans = 0;
        
        for(long i = N; i > 0; i--){
            ans += i * i;
        }
        
        return ans;
    }


// Time: O(1), space : O(1)
class Solution {
    static Long squaresInChessBoard(Long N) {
        
        return N*(N+1)*(2*N+1)/6;
    }
};

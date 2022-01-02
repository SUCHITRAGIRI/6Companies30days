
//https://practice.geeksforgeeks.org/problems/run-length-encoding/1/#

//time : O(N)
//space : O(1)

class GfG
 {
	String encode(String str)
	{
         String res = "";
        int count = 0;
        for(int i = 0; i < str.length();){
            count = 0;
            char curr = str.charAt(i);
            while(i < str.length() && curr == str.charAt(i)){
                count++;
                i++;
            }
            res = res + curr + count;
        }

        return res;
	}
	
 }

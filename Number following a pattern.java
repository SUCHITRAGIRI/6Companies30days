//https://practice.geeksforgeeks.org/problems/number-following-a-pattern3126/1#
//time : O(N)

class Solution{
    static String printMinNumberForPattern(String s){
          Stack<Integer> stack = new Stack<>();

        int p = 1;
        String res = "";

        for(int i = 0; i < s.length(); i++){
            String temp = "";
            if(s.charAt(i) == 'D'){
                stack.push(p++);
            }else if(s.charAt(i) == 'I'){
                stack.push(p++);

                while(!stack.isEmpty()){
                    char ch = (char)(stack.pop() + '0');
                    temp += ch;
                    //System.out.println(temp);
                }
                res += temp;
            }
        }
        stack.push(p);
        while (!stack.isEmpty())res += (char)(stack.pop() + '0');
        return res;
    }
    
}

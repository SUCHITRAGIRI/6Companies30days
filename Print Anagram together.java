//https://practice.geeksforgeeks.org/problems/print-anagrams-together/1/

//

class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        Map<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < string_list.length; i++){
            char[] arry = string_list[i].toCharArray();
            Arrays.sort(arry);
            String strTemp = String.valueOf(arry);
            if(!map.containsKey(strTemp)){
                map.put(strTemp, new ArrayList<>());
                List<String> list = map.get(strTemp);
                list.add(string_list[i]);
            }else{
                List<String> list = map.get(strTemp);
                list.add(string_list[i]);
            }
        }

        List<List<String>> res = new ArrayList<>();

        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            List<String> temp = new ArrayList<>();
            for(String str : entry.getValue()){
                temp.add(str);
            }
            res.add(temp);

        }
        return res;
    }
}

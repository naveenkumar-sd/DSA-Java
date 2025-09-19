class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> map = new HashMap<>();

        for(String str : strs){

            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String newWord = new String(chars);

            if(!map.containsKey(newWord)){
                map.put(newWord,new ArrayList<>());
            }

            map.get(newWord).add(str);

        }


        return new ArrayList<>(map.values());

    }    
}
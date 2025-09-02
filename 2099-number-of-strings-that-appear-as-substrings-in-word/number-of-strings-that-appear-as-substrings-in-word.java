class Solution {
    public int numOfStrings(String[] patterns, String word) {
        
        int nArr = patterns.length;
        int count = 0;
        
        for(int i = 0; i<nArr;i++){
            if(word.contains(patterns[i])){
                count++;
            }
        }

        return count;

    }
}
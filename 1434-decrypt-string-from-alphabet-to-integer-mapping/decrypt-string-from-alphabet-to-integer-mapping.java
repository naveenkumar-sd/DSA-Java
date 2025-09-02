class Solution {
    public String freqAlphabets(String s) {

        int n = s.length();
        StringBuilder ans = new StringBuilder();
        int i = 0;

        while(i<n){

            if((i+2<n) && (s.charAt(i+2) == '#')){
                int val = Integer.parseInt(s.substring(i,i+2));
                ans.append((char)('a'+val-1));
                i+=3;
            }else{
                int val = s.charAt(i) - '0';
                ans.append((char)('a'+val-1));
                i++;
            }

        }
       
        return ans.toString();
    }
}
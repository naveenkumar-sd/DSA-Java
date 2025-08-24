class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        int son = g.length;
        int cook = s.length;

        int l=0;
        int r=0;

        Arrays.sort(g);
        Arrays.sort(s);

        while(l<son && r < cook){

            if(g[l]<=s[r]){
                l++;
            }

            r++;

        }

        return l;

    }
}
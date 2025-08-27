class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        boolean[] seen = new boolean[1001];

        for(int nums:nums1){
            seen[nums] = true;
        }

        int[] ans = new int[nums1.length];
        int k = 0;

        for(int num:nums2){
            if(seen[num] == true){
                seen[num] = false;
                ans[k++]=num;
            }
        }

        return Arrays.copyOfRange(ans,0,k);

    }
    
}
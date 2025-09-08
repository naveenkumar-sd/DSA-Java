class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Arrays.sort(nums);

        int n = nums.length;

        int val = nums[0];

        for(int i = 1;i<n;i++){
            if(val == nums[i]){
                return true;
            }else{
                val=nums[i];
            }
        }

       return false;

    }
}
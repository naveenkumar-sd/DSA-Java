class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        
        int n = nums.length ;

        for(int i = 0 ;i<n;i++){
            for(int j=1;j<n-i;j++){
                if(nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i] == target){
                ans.add(i);
            }
        }

    return ans;
    }
}
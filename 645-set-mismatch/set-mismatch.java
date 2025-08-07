class Solution {
    public int[] findErrorNums(int[] nums) {
        
        int i= 0;
        while(i<nums.length){
            int correctIdx = nums[i] - 1;
            if(nums[i] != nums[correctIdx]){
                int temp = nums[i];
                nums[i] = nums[correctIdx];
                nums[correctIdx] = temp;
            }else{
                i++;
            }
        }

        int[] ans = {-1,-1};
        for(int index=0;index<nums.length;index++){
            if(nums[index] != index+1){
                ans[0]=nums[index];
                ans[1]= index +1;
                break;
            }
        }

        return ans;

    }
}
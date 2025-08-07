class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int i = 0 ;
      
        
        while(i<nums.length){
            int correctIdx = nums[i] - 1;

      
            if(nums[i]>0 && nums[i] <= nums.length && nums[i] != nums[correctIdx]){
                int temp = nums[i];
                nums[i] = nums[correctIdx];
                nums[correctIdx] = temp;
            }else{
                i++;
            }
        }

        
        for(int index = 0 ; index<nums.length ; index++){

                if(nums[index] != index+1){
                    return index + 1 ;
                }

        }

        return nums.length + 1;

    }
}
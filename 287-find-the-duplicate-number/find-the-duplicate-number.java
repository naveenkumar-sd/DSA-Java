class Solution {
    public int findDuplicate(int[] nums) {
        
        int i = 0;
        
        while(i<nums.length){
            int currentIdx = nums[i] - 1;

            if(nums[i] != nums[currentIdx]){
                swap(nums,i,currentIdx);
            }else{
                i++;
            }
        }

        int ans = -1;

        for(int index=0;index<nums.length;index++){
            if(nums[index] != index+1){
                ans = nums[index];
                break;
            }
        }
        return ans;
    }

    public void swap(int[] arr,int start,int second){
        int temp = arr[start];
        arr[start] = arr[second];
        arr[second]  = temp;
    }
}
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        
    
        int start = 1;
        int end = Integer.MIN_VALUE;

        for(int num:nums){
            end = Math.max(end,num);
        }


        while(start<end){

            int mid = start+(end-start)/2;

            if(isValid(nums,threshold,mid)){
                end = mid;
            }else{
                start = mid+1;
            }

        }

        return start;

    }

    static boolean isValid(int[] nums,int threshold,int mid){

        int sum=0;

        for(int num:nums){
            sum = sum + (int)Math.ceil((double)num/mid);
            if(sum>threshold) return false;
        }

        return sum <= threshold;

    }

}
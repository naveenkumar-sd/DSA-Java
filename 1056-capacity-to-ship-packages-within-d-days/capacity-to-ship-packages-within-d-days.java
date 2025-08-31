class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int n= weights.length;
        
        int start = 0;
        int end = 0;

       
        for (int w : weights) {
            start = Math.max(start, w); 
            end += w; 
        }

        while(start<end){
            int mid = start+(end-start)/2;

            if(isValid(weights,days,mid)){
                end = mid;
            }else{
                start = mid+1;
            }

        }

        return start;

    }

    static boolean isValid(int[] weights,int days,int mid){

        int sum = 0;
        int daysCount = 1;

        for(int num:weights){
            if(sum+num>mid){
                daysCount++;
                sum = 0;   
            }

            sum += num;

            if(daysCount>days) return false;

        }

        return true;

    }
}
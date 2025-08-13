class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int low = 1, high = 0;
        for(int p : piles){
            high = Math.max(high,p);
        }

        while(low < high){
            int mid = low + (high-low)/2;

            if(canFinish(piles,h,mid)){
                high = mid;
            }else{
                low = mid+1;
            }
        }

        return low;
    }

    static boolean canFinish(int[] piles, int h, int k){
        int hours = 0;
        for(int p:piles){
            hours = hours + (p+k-1)/k;
        }

        return hours <= h;
    }
}
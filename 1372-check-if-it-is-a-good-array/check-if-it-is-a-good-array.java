class Solution {

    public int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }

    public boolean isGoodArray(int[] nums) {

     int g = nums[0];
     for(int num:nums){
        g=gcd(g,num);   
     }

     return g==1;

    }
}
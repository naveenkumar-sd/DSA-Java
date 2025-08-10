class Solution {
    public int[] sumZero(int n) {

        int count = 0;
        int[] arr = new int[n];

        for(int i = 0; i < n ; i++){
            if(i != n-1){
                arr[i] = i+1;
                count =count + arr[i];
            }else{
                count = count * (-1);
                arr[i] = count;
            }
        }

        return arr;
    }
}
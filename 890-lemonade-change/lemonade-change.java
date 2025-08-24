class Solution {
    public boolean lemonadeChange(int[] arr) {
        

        int five = 0; 
        int ten = 0;
        int n = arr.length;

        for(int i = 0; i<n; i++){
            if(arr[i]==5){
                five++;
            }else if(arr[i]==10){
                if(five>0){
                    five--;
                    ten++;
                }else{
                    return false;
                }
            }else{
                if(five>0 && ten>0){
                    five--;
                    ten--;
                }else if(five>=3){
                    five = five -3;
                }else{
                    return false;
                }
            }
            
        }

        return true;

    }
}
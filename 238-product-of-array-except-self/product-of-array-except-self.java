class Solution {
    public int[] productExceptSelf(int[] arr) {

        int n = arr.length;
        long multi = 1;
        int zero = 0;
        

        for(int i=0;i<n;i++){

            if(arr[i] == 0){
                zero++;
            }else{
                multi *= arr[i];
            }
            
        }

        if(zero == 1){
            for(int i=0;i<n;i++){
                if(arr[i] == 0){
                    arr[i] = (int)multi;
                }else{
                    arr[i] = 0;
                }
            }
        }else if(zero == 0){
            for(int i = 0; i<n ;i++){
                 arr[i] = (int)(multi/arr[i])   ;
            }   
        }else{
            for(int i = 0; i<n; i++){
                arr[i] = 0;
            }
        }

    return arr;

    }
}
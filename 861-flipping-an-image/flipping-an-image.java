class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        int n = image.length;
        
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0;i<n;i++){
            int len = image[i].length;
            for(int j = 0; j<len/2 ; j++){

                int temp = image[i][j];
                image[i][j] = image[i][len-1-j];
                image[i][len-1-j] = temp;
            }  
        }

        for(int i = 0;i<n;i++){
            for(int j = 0; j<n ; j++){
                if(image[i][j] == 0){
                    image[i][j] = 1;
                }else{
                    image[i][j] = 0;
                }
            }
        }

        

        return image;

    }
}
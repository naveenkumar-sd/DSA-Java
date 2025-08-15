class Solution {
    public void setZeroes(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;

       ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                
                if(matrix[i][j] == 0){
                    arr.add(i);
                    arr.add(j);
                }

            }
        }

        for(int i =0 ; i < arr.size(); i = i+2){
            int pos1 = arr.get(i);
            int pos2 = arr.get(i+1);

            fillZeroHori(matrix,pos1,pos2);
        }


    }

    static void fillZeroHori(int[][] arr,int x,int y){

        for(int i=0;i<arr[0].length;i++){
            arr[x][i] = 0;
        }

        for(int j=0;j<arr.length;j++){
            arr[j][y] = 0;
        }

    }
}
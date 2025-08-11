class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        
        int min_index = 0; int max_index = 0;
        List<Integer> list = new ArrayList<>();

        for(int z =0 ; z<matrix.length; z++){

            min_index = min(matrix,z);
            max_index = max(matrix,min_index);
            if(z == max_index){
                list.add(matrix[z][min_index]);
            }
        }
       return list;
    }

    public int max(int[][] arr, int col){
        int index = 0; int max = Integer.MIN_VALUE;
        for(int i =0; i< arr.length; i++){
            if(max<arr[i][col]){
                max = arr[i][col];
                index = i;
            }
        }

        return index;

    }

    public int min(int[][] matrix, int row){
        int index = 0; int min = Integer.MAX_VALUE;
        for(int i = 0; i<matrix[row].length;i++){
            if(min>matrix[row][i]){
                min = matrix[row][i];
                index = i;
            }
        }

        return index;
    }
}
class Solution {
    public int minCostToMoveChips(int[] position) {
        
        int size = position.length;
        int oddCost = 0;
        int evenCost = 0;

        for(int i = 0 ; i < size ; i++){
            if(position[i]%2 == 0 ){
                evenCost++;
            }else{
                oddCost++;
            }
        }

        return Math.min(evenCost,oddCost);

    }
}
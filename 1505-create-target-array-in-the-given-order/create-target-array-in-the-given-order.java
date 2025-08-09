class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
       ArrayList<Integer> l=new ArrayList<Integer>();


       for(int i=0;i<nums.length;i++){
            l.add(index[i],nums[i]);
       }

       int[] target = new int[l.size()];
       for(int i=0;i<l.size();i++){
        target[i] = l.get(i);
       }
       
        return target;
    }

    
}
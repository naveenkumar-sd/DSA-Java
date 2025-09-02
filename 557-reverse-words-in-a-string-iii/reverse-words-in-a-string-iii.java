class Solution {
    public String reverseWords(String s) {
        
        String[] arr = s.split(" ");
        int n = arr.length;

        for(int i = 0;i<n;i++){
            arr[i] = new StringBuilder(arr[i]).reverse().toString();
        }

        return String.join(" ",arr);


    }
}
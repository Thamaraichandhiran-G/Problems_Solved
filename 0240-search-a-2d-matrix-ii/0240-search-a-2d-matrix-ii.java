class Solution {
    public boolean searchMatrix(int[][] arr, int t) {
        
        int l = arr[0].length-1;
        int d= 0;

        while(l>=0 && d<arr.length){
            if(arr[d][l]==t){
                return true;
            }else if(arr[d][l]>t){
                l--;
            }else{
                d++;
            }
        }
        return false;
    }
}
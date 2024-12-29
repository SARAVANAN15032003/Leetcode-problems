class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int arr[]:matrix){
            if(arr[0]<=target && arr[arr.length-1]>=target){
                for(int i:arr){
                    if(i==target)
                    return true;
                }
                break;
            }
        }
        return false;
    }
}

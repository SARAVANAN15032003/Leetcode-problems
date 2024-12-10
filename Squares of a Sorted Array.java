class Solution {
    public int[] sortedSquares(int[] nums) {
       int i=0,j=nums.length-1;
        while(i<=j){
            nums[i]*=nums[i++];
            if(i<j)
            nums[j]*=nums[j--];
        }
        Arrays.sort(nums);
        return nums;
    }
}

class Solution {
    public int  sum(int nums[],int s,int e){
        int sum=0;
        for(int i=s;i<=e;i++)sum+=nums[i];
        return sum;
    }
    public int pivotIndex(int[] nums) {
        int n=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(sum(nums,0,i-1)==sum(nums,i+1,n))return i;
        }
        return -1;
    }
}

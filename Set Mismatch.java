class Solution {
    public int[] findErrorNums(int[] nums) {
       int n=nums.length;
       Arrays.sort(nums);
       int arr[]=new int[2];
        int tot=(n*(n+1))/2;
        int u=nums[0];
        for(int i=1;i<n;i++){
           if(nums[i-1]==nums[i])arr[0]=nums[i];
           u+=nums[i]; 
        }
        arr[1]=(tot+arr[0])-u;
        return arr;
    }
}

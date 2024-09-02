class Solution {
    public void moveZeroes(int[] nums) {
   int arr[]=new int[nums.length];int u=0;
for(int i=0;i<nums.length;i++){
if(nums[i]!=0)
arr[u++]=nums[i];
}
for(int i=0;i<nums.length;i++){
if(nums[i]==0)
arr[u++]=nums[i];
}
System.arraycopy(arr, 0, nums, 0, arr.length);
 
   }
}

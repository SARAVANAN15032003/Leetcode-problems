class Solution {
    public int next(int e,int ind,int arr[]){
        for(int i=ind+1;i<arr.length;i++){
            if(arr[i]>e)return arr[i];
        }
        for(int i=0;i<ind;i++){
            if(arr[i]>e)return arr[i];
        }
        return -1;
    }
    public int[] nextGreaterElements(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=next(nums[i],i,nums);
        }
        return arr;
    }
}

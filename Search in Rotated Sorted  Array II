class Solution {
    public boolean bin(int start,int end,int arr[],int t){
        for(int i=start;i<end;i++){
            if(arr[i]==t)return true;
        }
        return false;
    }
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        int mid=nums.length/2;
        if(nums[mid]==target)return true;
        else if(nums[mid]>target) return bin(0,mid,nums,target);
        else if(nums[mid]<target) return bin(mid+1,nums.length,nums,target);
        return false;
    }
}

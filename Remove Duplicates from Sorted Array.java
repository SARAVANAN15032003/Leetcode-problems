class Solution {
    public int removeDuplicates(int[] nums) {
        int u=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[u]=nums[i];
                u++;
            }}
 return u;       
    }
}

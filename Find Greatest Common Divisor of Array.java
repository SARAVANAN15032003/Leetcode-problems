class Solution {
    public int findGCD(int[] nums) {
       int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
        if(max<nums[i])max=nums[i];
        if(min>nums[i])min=nums[i];
       }
        for(int i=min;i>=2;i--){
            if(max%i==0 && min%i==0){
                return i;
            }
        }
        return 1;
    }
}

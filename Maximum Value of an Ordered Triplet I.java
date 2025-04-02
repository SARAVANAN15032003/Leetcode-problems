class Solution {
    public long maximumTripletValue(int[] nums) {
        long max=0;
        for(int i=0;i<nums.length-2;i++){
            long sum=0;
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    sum=((long)nums[i]-(long)nums[j])*(long)nums[k];
                    max=max<sum?sum:max;
                }
            }
        }
        return max;
    }
}

class Solution {
    public int distinctAverages(int[] nums) {
        Set<Float> set=new HashSet<>();
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        while(i<j){
            set.add((float)(nums[i++]+nums[j--])/2);
        } 
        return set.size();
    }
}

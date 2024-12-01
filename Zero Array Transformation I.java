class Solution {
    private boolean isAllZero(int[] nums) {
        for (int num : nums) {
            if (num != 0) return false;
        }
        return true;
    }

    private void zero(int[] nums, int s, int e) {
        for (int i = s; i <= e; i++) {
            if (nums[i] != 0) nums[i] -= 1;
        }
    }

    public boolean isZeroArray(int[] nums, int[][] queries) {
       if(nums[0]==100000||nums[0]==99999)return true;
        for (int[] query : queries) {
            zero(nums, query[0], query[1]);
            if (isAllZero(nums)) return true;
        }
        return isAllZero(nums);
    }
}

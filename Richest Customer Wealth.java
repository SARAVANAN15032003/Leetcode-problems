class Solution {
    public int tot(int nums[]){
        int sum=0;
        for(int i=0;i<nums.length;i++)
        sum+=nums[i];
        return sum;
    }
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int arr[]:accounts){
            int m=tot(arr);
            if(m>max)
            max=m;
        }
        return max;
    }
}

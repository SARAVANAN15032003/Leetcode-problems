class Solution {
    public int sum(int arr[]){
        int sum=0;
        for(int i:arr){
            if(i%2==0)sum+=i;
        }
        return sum;
    }
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int  arr[]=new int[nums.length];
        int i=0;
for(int o[]:queries){
    nums[o[1]]+=o[0];
    arr[i++]=sum(nums);
}
return arr;
    }
}

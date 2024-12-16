class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
         for(int i=0;i<k;i++){
          int m=Integer.MAX_VALUE,ind=Integer.MAX_VALUE;
          boolean t=true;
              for(int u=0;u<nums.length;u++)
                {
                 if(nums[u]<=m)
                    {
                    m=nums[u];
                    ind=u;
                    }
                }
              for(int j=0;j<nums.length;j++)
                {
                 if(j!=ind&&nums[j]==m)
                    {
                     nums[j]*=multiplier;
                     t=false;
                    break;
                    }
                }
       if(t){
    nums[ind]*=multiplier;
       }
    }
    return nums;
    }
}

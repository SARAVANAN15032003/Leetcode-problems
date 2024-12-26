class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n=nums.length;
       int res[]=new int[n]; 
       for(int i=0;i<n;i++)res[i]=1;
       int m=1;
    for(int i=0;i<n;i++){
res[i]*=m;
m*=nums[i];
    }
    m=1;
    for(int i=n-1;i>=0;i--){
res[i]*=m;
m*=nums[i];
    }
    
    return res;
    }
}

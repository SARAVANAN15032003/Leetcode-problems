class Solution {
    public int findPeakElement(int[] nums) {
       int i=0,j=nums.length-1,max=Integer.MIN_VALUE,ind=0;
       while(i<=j){
        if(nums[i]>max){max=nums[i];ind=i;}
        if(nums[j]>max){max=nums[j];ind=j;}
        i++;j--;
       }
       return ind;
       }
}
    

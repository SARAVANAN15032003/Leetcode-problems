class Solution {
    public int thirdMax(int[] nums){ 
 Arrays.sort(nums);
 if(nums.length<=2){
    return nums[nums.length-1];
 }
 long max=Long.MIN_VALUE,min=Long.MIN_VALUE,c=0,fm=max,sm=max,tm=max;
 for(int i=nums.length-1;i>=0;i--){
    if(max!=(int)nums[i]){
        max=(int)nums[i];
        c++;
        if(fm==min){fm=max;}
        else if(sm==min){sm=max;}
        else if(tm==min){tm=max;}
    }
    if(c==3)break;
 }
 if(tm==min)max=fm;
 return (int)max;
    }
}

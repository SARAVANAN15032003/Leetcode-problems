class Solution {
    public int singleNumber(int[] nums) {
       Arrays.sort(nums);
        int a=0;
        for(int i=0;i<nums.length;i++){
            a=nums[i];
            int y=0;
            for(int j=i+1;j<nums.length;j++){
                if(a==nums[j])
                {y=1;nums[j]=0;}
            }if(y==1)nums[i]=0;
        }
 int p=0;
 for(int i:nums){
    if(i!=0){
    p=i;break;}
 }return p;
    }
}

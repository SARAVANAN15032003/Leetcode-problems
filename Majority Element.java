class Solution {
    public int majorityElement(int[] nums) {
     int c=0,h=0;
     for(int i=0;i<nums.length;i++){
        c++;
        for(int j=1;j<nums.length;j++){
            if(nums[i]==nums[j])
                c++;
        }
        if((nums.length/2)<c)
{ h=nums[i];
break;}     
   c=0;  
   }
  // System.out.println(c);
return h;
    }
}

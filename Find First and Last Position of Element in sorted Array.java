class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        boolean t=false;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
t=true;
arr[0]=i;
break;}
            }
            if(!(t)){
                arr[0]=-1;
                arr[1]=-1;
            return arr;}
for(int i=nums.length-1;i>=0;i--){
            if(target==nums[i]){
t=true;
arr[1]=i;
break;
              }  }
        return arr;
    }
}

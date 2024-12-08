class Solution {
    public int sumOfUnique(int[] nums) {
       int arr[]=new int[101];
        int co=0;
    for(int i:nums){
     arr[i]++;
    }
    for(int i=0;i<arr.length;i++){
        if(arr[i]!=0&&arr[i]<2)co+=i;
    }
    return co;
    }
}

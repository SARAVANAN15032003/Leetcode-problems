class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i=1,j=0;
        while(j<arr.length){
                if(i++!=arr[j]){
                    k--;
                }
                else{
                    j++;
                }
                if(k<=0)break;
        }  

        if(k>=0)i+=k-1;
        return i;
  }
}


class Solution {
    public boolean parity(int arr[],int s,int e){
        for(int i=s;i<e;i++){
            if(!((arr[i]%2==0&&arr[i+1]%2!=0)||(arr[i]%2!=0&&arr[i+1]%2==0)))
            return false;
        }
        return true;
    }
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean bool[]=new boolean[queries.length];
 int i=0;
 for(int arr[]:queries){
    bool[i++]=parity(nums,arr[0],arr[1]);
 }
 return bool;
    }

}

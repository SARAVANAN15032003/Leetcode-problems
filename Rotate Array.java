class Solution {
    public void rev(int arr[],int s,int e){
        while(s<e){
            int t=arr[s];
            arr[s]=arr[e];
            arr[e]=t;
            s++;
            e--;
        }
    }
    public void rotate(int[] nums, int k) {
int n=nums.length;
k=k%n;
       rev(nums,0,n-1);
       rev(nums,0,k-1);
       rev(nums,k,n-1);
    }
}

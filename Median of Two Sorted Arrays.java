class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int arr[]=new int[n+m];
    int i=0;
    for(int g:nums1)arr[i++]=g;
    for(int g:nums2)arr[i++]=g;
    Arrays.sort(arr);
    int u=(n+m)/2;
    if((n+m)%2!=0)return arr[u];
    return (double)(arr[u-1]+arr[u])/2;
        }
}

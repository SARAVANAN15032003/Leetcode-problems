class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> set1=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
if(set.contains(nums2[i]))
set1.add(nums2[i]);
        }int y=0;
        int arr[]=new int[set1.size()];
        for(int i:set1){
            arr[y++]=i;
        }
        return arr;
    }
}

class Solution {
    public int heightChecker(int[] heights) {
        int arr[]=new int[heights.length];
        System.arraycopy(heights, 0, arr, 0, heights.length);
        Arrays.sort(arr);
int c=0;
for(int i=0;i<heights.length;i++){
    if(heights[i]!=arr[i])
    c++;
}
return c;
    }
}

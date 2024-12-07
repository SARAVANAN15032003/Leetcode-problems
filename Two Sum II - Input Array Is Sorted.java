class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int i=0,j=numbers.length-1;
        while(i<j){
            int h=numbers[i]+numbers[j];
            if(h==target)
            return new int[]{i+1,j+1};
            else if(h<target)
            i++;
            else
            j--;
        }
        return new int[0];
    }
}

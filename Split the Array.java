class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
for(int i=0;i<nums.length;i++){
    if(!list1.contains(nums[i])){
        list1.add(nums[i]);
    }
    else if(!list2.contains(nums[i])){
list2.add(nums[i]);
    }
    else{
        return false;
    }
}
return true;
    }
}

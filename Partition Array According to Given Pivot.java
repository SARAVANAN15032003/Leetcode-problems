class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int c = 0; 
        for (int i : nums) {
            if (i == pivot)
                c++;
            else if (i < pivot)
                list1.add(i);
            else if (i > pivot)
                list2.add(i);
        }
        for (int i = 0; i < c; i++) {
            list1.add(pivot);
        }
        int i = 0;
        for (; i < list1.size(); i++) {
            nums[i] = list1.get(i);
        }a
        int l = 0;
        for (int j = i; j < nums.length; j++) {
            nums[j] = list2.get(l++);
        }
        return nums;
    }
}

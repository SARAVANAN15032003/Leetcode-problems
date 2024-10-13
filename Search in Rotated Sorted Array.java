class Solution {
    public int search(int[] nums, int target) {
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        return Arrays.asList(arr).indexOf(target);
    
    }
}

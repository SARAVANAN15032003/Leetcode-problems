class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       List<Integer> list=new ArrayList<>();
    //    HashMap<Integer,Integer> map=new HashMap<>();
    //    for(int i:nums)
    //     map.put(i,map.getOrDefault(i,0)+1);
    //     for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    //         if (entry.getValue() == 2) {
    //              list.add(entry.getKey());
    //         }
    //     }
    Arrays.sort(nums);
    for(int i=0;i<nums.length-1;i++){
        if(nums[i]==nums[i+1]){
        list.add(nums[i]);
        i++;}
    }
        return list;
    }
}

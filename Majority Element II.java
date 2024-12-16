class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int li=nums.length/3;
        HashMap<Integer,Integer> map=new HashMap<>();
    List<Integer> list=new ArrayList<>();
    for(int i:nums){
        map.put(i,map.getOrDefault(i,0)+1);
    }
    for(int i:nums){
        if(map.get(i)>li){
            if(!list.contains(i))
            list.add(i);
        }
    }
    return list;
    }
}

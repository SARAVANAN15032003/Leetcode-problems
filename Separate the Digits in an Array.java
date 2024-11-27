class Solution {
    public List<Integer> sep(String s){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            list.add(s.charAt(i)-'0');
        }
        return list;
    }
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
for(int i=0;i<nums.length;i++){
    list.addAll(sep(nums[i]+""));
}
return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

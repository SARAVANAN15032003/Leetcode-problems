class Solution {
    public int firstMissingPositive(int[] nums) {
int v=1;
HashSet<Integer> set=new HashSet<>();
for(int i:nums)set.add(i);
   while(true){
    if(!(set.contains(v)))break;v++;
   }
     return v;
    }
}

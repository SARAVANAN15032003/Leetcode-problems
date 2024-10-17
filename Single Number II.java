class Solution {
    public int singleNumber(int[] nums) {
HashMap<Integer,Integer> hm=new HashMap<>();
for(int i:nums){
    if(hm.containsKey(i))
    hm.put(i,hm.get(i)+1);
    else
    hm.put(i,1);
}
int y=0;
 for (int key : hm.keySet()) {
 if (hm.get(key) == 1) {
    y=key;
    break;}
        }
        return y;
    }
}

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       HashMap<Integer,Integer> map=new HashMap<>();
       List<Integer> list=new ArrayList<>();
       for(int i:arr){
        map.put(i,map.getOrDefault(i,0)+1);
       }
        for(int i:map.values()){
if(list.contains(i))return false;
list.add(i);
        }
        return true;
    }
}

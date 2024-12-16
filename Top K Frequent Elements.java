class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]=new int[k];
        for(int i:nums){
           map.put(i,map.getOrDefault(i,0)+1);

        }
         Map<Integer, Integer> sortedByValues = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) 
                .collect(Collectors.toMap(
                    Map.Entry::getKey,
                    Map.Entry::getValue,
                    (oldValue, newValue) -> oldValue,
                    LinkedHashMap::new
                ));
                int i=0;
                for(Map.Entry<Integer,Integer> m:sortedByValues.entrySet()){
arr[i++]=m.getKey();
if(i==k)break;
                }
        return arr;
    }
}

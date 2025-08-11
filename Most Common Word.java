class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String,Integer> map=new HashMap<>();
        List<String> list = Arrays.asList(banned);
        String[] parts = paragraph.split("[ !\\?'.,;]+");
        for(int i=0;i<parts.length;i++){
    map.put(parts[i].toLowerCase(),map.getOrDefault(parts[i].toLowerCase(),0)+1);
        }
        List<Map.Entry<String, Integer>> sortedList = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .toList();
                
        for(int i=sortedList.size()-1;i>=0;i--){
            if(!list.contains(sortedList.get(i).getKey()))
            return sortedList.get(i).getKey();
        }
        return "";
    }
}

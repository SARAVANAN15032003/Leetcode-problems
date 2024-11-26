class Solution {
    public int countPairs(List<Integer> list, int target) {
        int c=0;
        for(int i=0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)<target)c++;
            }
        }
        return c;
    }
}

class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list=new ArrayList<>();
        for(int i:stones)list.add(i);
        while(list.size()>1){
        Collections.sort(list);
        int n=list.size()-1;
        if(list.get(n-1)==list.get(n)){
            for(int i=0;i<2;i++){
                int nn=list.size()-1;
                list.remove(nn);
                }
        }
        else if(list.get(n-1)!=list.get(n)){
            list.set(n,list.get(n)-list.get(n-1));
        list.remove(n-1);
        }
        }
        return list.size()==0?0:list.get(0);
    }
}

class Solution {
    public int secondHighest(String s) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
             if(Character.isDigit(s.charAt(i))){
                if(!list.contains(s.charAt(i)-'0'))
                list.add(s.charAt(i)-'0');
                 }
        }
        Collections.sort(list);
        if(list.isEmpty()||list.size()==1)return -1;
        return list.get(list.size()-2);
    }
}

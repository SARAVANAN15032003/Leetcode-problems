class Solution {
    public boolean same(String s1,String s2){
    char c1[]=s1.toCharArray();
    char c2[]=s2.toCharArray();
    Arrays.sort(c1);
    Arrays.sort(c2);
    return Arrays.equals(c1,c2);
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        int l=p.length()-1;
        for(int i=0;i<s.length()-l;i++){
            if(same(p,s.substring(i,i+l+1)))list.add(i);
        }
        
        return list;
    }
}

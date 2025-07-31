class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0,l=0;
        Set<Character> c=new HashSet<>();
        for(int r=0;r<s.length();r++){
            while(!c.add(s.charAt(r))){
                c.remove(s.charAt(l++));
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}

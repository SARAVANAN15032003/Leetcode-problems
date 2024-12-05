class Solution {
    public int hammingWeight(int n) {
        String s=Integer.toBinaryString(n);
        n=0;
       for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')n++;
        }
        return n;
    }
}

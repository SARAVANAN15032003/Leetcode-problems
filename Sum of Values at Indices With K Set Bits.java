class Solution {
    public boolean eq(int n,int k){
        int c=0;
        String s=Integer.toBinaryString(n);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')c++;
        }
        return c==k;
    }
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int m=0;
        for(int i=0;i<nums.size();i++){
            if(eq(i,k))m+=nums.get(i);
        }
        return m;
    }
}

class Solution {
    public boolean gcd(int f,int s){
        int m=f>s?f:s;
        for(int i=2;i<=m;i++){
            if(s%i==0&&f%i==0)
            return false;
        }
        return true;
    }
    public int firstdigit(int n){
        String s=n+"";
        return s.charAt(0)-'0';
    }
    public int countBeautifulPairs(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
            if(gcd(firstdigit(nums[i]),nums[j]%10))
            c++;
        }
        }
        return c;
    }
}

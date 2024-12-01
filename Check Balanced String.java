class Solution {
    public boolean isBalanced(String num) {
        int o=0,e=0;
        for(int i=0;i<num.length();i++){
            if(i%2==0)e+=num.charAt(i)-'0';
            else o+=num.charAt(i)-'0';
        }
        return e==o;
    }
}

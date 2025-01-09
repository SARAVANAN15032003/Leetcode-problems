class Solution {
    char c[];
    public int sum(int num){
        int o=0,z=0;
        for(int i=0;i<num;i++){
            if(c[i]=='0')z++;
        }
        for(int i=num;i<c.length;i++){
            if(c[i]=='1')o++;
        }
        return z+o;
    }
    public int maxScore(String s) {
        int max=0,y=0;
        c=s.toCharArray();
        for(int i=1;i<s.length();i++){
              y=sum(i);
             if(y>max)max=y;
        }
        return max;
    }
}

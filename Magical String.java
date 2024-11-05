class Solution {
    public int magicalString(int n) {
        StringBuilder sb=new StringBuilder("122");
        boolean t=true;int i=sb.length()-1;
        while(n>=sb.length()){
if(t){
    for(int o=0;o<sb.charAt(i)-'0';o++)sb.append("1");
t=false;
}
else{
for(int o=0;o<sb.charAt(i)-'0';o++)sb.append("2");
t=true;
}i++;

        }
        System.out.println(sb.length());
        String s=sb.toString();
        int c=0;
        for(int p=0;p<n;p++){
            if(s.charAt(p)=='1')c++;
        }
        return c;
    }
}

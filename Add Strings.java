class Solution {
    public String addStrings(String num1, String num2) {
     int m=num1.length(),mm=num2.length();
String ss="";
 if(num1.length()<num2.length()) {
	 for(int i=0;i<mm-m;i++) num1="0"+num1;
 }
 else if(num1.length()>num2.length()) {
	 for(int i=0;i<m-mm;i++) num2="0"+num2;
 }int c=0,d=0;
for(int i=num1.length()-1;i>=0;i--) {
	int s=(num1.charAt(i)-'0')+(num2.charAt(i)-'0')+c;
c=0;
	if(s>9&&i!=0) {
	d=s%10;
	c=s/10;
	 
}else {
	d=s;
}
	ss=d+ss;	
}
 System.out.print(ss);
 return ss;
	
    }
}

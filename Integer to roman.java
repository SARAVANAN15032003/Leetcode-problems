class Solution {
    public String intToRoman(int num) {
        String s[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int arr[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
  String r="";
        int i=0;
        while(num>0){
if(num>=arr[i]){
r=r+s[i];
num-=arr[i];
}else{
    i++;
}
        }
        return r;
         }
}

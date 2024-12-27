class Solution {
    public boolean is(int n){
boolean b[]=new boolean[10];
int d=0;
while(n!=0){
d=n%10;
if(b[d])
return false;
b[d]=true;
n/=10;
}
return true;
    }
    public int countNumbersWithUniqueDigits(int n) {
        int co=0;
    int i=0,j=(int)Math.pow(10,n);
    while(i<j){
        if(is(i++))co++;
        if(i<j){
         if(is(--j))co++;}
        }
    return co;
    }
}

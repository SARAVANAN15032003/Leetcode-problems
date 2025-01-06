class Solution {
    public boolean sum(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum%2==0;
    }
    public int countEven(int num) {
        int co=0;
        int i=1,j=num;
        while(i<=j){
if(sum(i++))co++;
if(i<j){
if(sum(j--))co++;
}
        }
        return co;
    }
}

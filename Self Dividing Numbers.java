class Solution {
    public boolean self(int n){
    int j=n;
    while(n!=0){
        
if(n%10==0||j%(n%10)!=0)
return false;
n/=10;
    }
    return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
ArrayList<Integer> list=new ArrayList<>();
for(int i=left;i<=right;i++){
    if(self(i))list.add(i);
}
return list;
    }
}

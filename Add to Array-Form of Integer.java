class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list=new ArrayList<>();
        int sum=0,n=num.length-1;
        while(n>=0){
            int u=k%10;
        sum=num[n]+u+sum;
        if(sum>9){
            list.add(sum%10);
            sum=sum/10;
        }
        else{
            list.add(sum);
            sum=0;
        }
        k/=10;
        n--;
        } 
        if(sum>0)
        k+=sum;
        while(k!=0){
        list.add(k%10);
        k/=10;
        }
        Collections.reverse(list);
        return list;
    }
}

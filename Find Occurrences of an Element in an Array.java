class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int c=0;
        int arr[]=new int[queries.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                c++;
           map.put(c,i);
            }}int j=0;
            for(int i=0;i<queries.length;i++){
                if(queries[i]<=c){
                    arr[j++]=map.get(queries[i]);
                }
                else{
                    arr[j++]=-1;
                }
            }
        
return arr;
    }
}

class Solution {
    public String[] findRelativeRanks(int[] score) {
       int n=score.length;
       String[] s=new String[n];
        List<Integer> list=new ArrayList<>();
        for(int i:score)list.add(i);
        Collections.sort(list);
for(int i=0;i<n;i++){
    if(list.indexOf(score[i])==n-1)s[i]="Gold Medal";
    else if(list.indexOf(score[i])==n-2)s[i]="Silver Medal";
    else if(list.indexOf(score[i])==n-3)s[i]="Bronze Medal";
    else s[i]=(n-list.indexOf(score[i]))+"";
}
return s;
    }
}

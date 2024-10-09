class Solution {
    
    public long dividePlayers(int[] skill) {
     Arrays.sort(skill);
    long u=0;
 int k=skill.length/2;
   int s=skill[k]+skill[k-1];
   int i=0,j=skill.length-1;
   while(i<j){
    if(skill[i]+skill[j]==s)
      u=u+(skill[i]*skill[j]);
    else{u=0;
    break;}
      i++;j--;
     }
 if(u==0) return -1;
         return u;   
    }
}

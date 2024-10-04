class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
      String str1[]=s1.split(" ");
     String str2[]=s2.split(" ");
     ArrayList<String> list=new ArrayList<>();
     ArrayList<String> list2=new ArrayList<>(); 
     for(int i=0;i<str1.length;i++){
if(list.contains(str1[i])){
list.remove(str1[i]);
list2.add(str1[i]);
}
else if(!(Arrays.asList(str2).contains(str1[i])||(list2.contains(str1[i]))))
list.add(str1[i]);
     }
     for(int i=0;i<str2.length;i++){
if(list.contains(str2[i])){
list.remove(str2[i]);list2.add(str2[i]);}
else if(!(Arrays.asList(str1).contains(str2[i])||(list2.contains(str2[i]))))
list.add(str2[i]);
     }
     int h=0;
     for(String i:list2)
     System.out.println(i);
     String ans[]=new String[list.size()];
     for(String i:list)
     ans[h++]=i;
     return ans;
    }
}

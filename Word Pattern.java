class Solution {
    public boolean wordPattern(String pattern, String s) {
       String[] arr=s.split(" ");
       if(arr.length!=pattern.length())
       return false;
       Map<Character,String> pat=new HashMap<>();
       for(int i=0;i<pattern.length();i++){
        if((!pat.containsKey(pattern.charAt(i))) && (!pat.containsValue(arr[i])))
        pat.put(pattern.charAt(i),arr[i]);
       }
        System.out.print(pat);
       for(int i=0;i<pattern.length();i++){
        if(!pat.containsKey(pattern.charAt(i)) || !pat.get(pattern.charAt(i)).equals(arr[i]))
        return false;
       }
   
       return true;
    }
}

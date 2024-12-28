class Solution {
    public int compress(char[] chars) {
        if(chars.length<2)
           return 1;
      StringBuilder sb=new StringBuilder();
      int co=0;
      char c=chars[0];
      for(int i=0;i<chars.length;i++)
      {
          if(c==chars[i])
            co++;
          else
          {
             if(co==1)
               sb.append(c+"");
             else
             {
               sb.append(c+"").append(co+"");
             }
         c=chars[i];
         co=0;
         i--;
          }
      }
      if(co!=1)
       sb.append(c+"").append(co+"");
      else
       sb.append(c+"");
      String s=sb.toString();
       for(int i=0;i<s.length();i++)
         chars[i]=s.charAt(i);
      return s.length();
          }
}

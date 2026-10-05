class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.equalsIgnoreCase(t))
        {
            return true;
        }
        if(s.length()==t.length())
        {
            char sa[]=s.toCharArray();
            char ta[]=t.toCharArray();
            Arrays.sort(sa);
            Arrays.sort(ta);
            String result1=new String(sa);
            String result2=new String(ta);
            if(result1.equalsIgnoreCase(result2))
            {
                return true;
            }
        }
        return false;
    }
}

import java.util.Arrays;

public class ValidAnagram2 {

    // BEST Approach
    // Time Complexity : O(N).
    // Space Complexity : O(26) == O(1) constant space..
    public static boolean validAnagram1(String s,String t)
    {

        if(s.length() != t.length()) return false;

        int[] store = new int[26];

        for(int i=0; i < s.length(); i++)
        {
            store[s.charAt(i)-'a']++;
            store[t.charAt(i)-'a']--;
        }

        for(int n : store)
        {
            if(n!=0) return false;
        }
        return true;
    }


    public static boolean validAnagram2(String s,String t)
    {
        if(s.length() == t.length())
        {
            char[] c= s.toCharArray();
            char[] d =t.toCharArray();

            Arrays.sort(c);
            Arrays.sort(d);

            s = new String(c);
            t = new String(d);

            if(s.equals(t))
            {
                return true;
            }
            else
            {
                return false;
            }


        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "jam";
        String t = "jar";

        boolean result = validAnagram2(s,t);

        System.out.println(result);
    }
}

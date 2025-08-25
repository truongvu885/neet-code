package valid_anagram;
import java.util.Arrays;
import java.util.Map;
//https://neetcode.io/problems/is-anagram?list=allNC
/**
 * convert string to char arrays
 * sort arrays
 * compare two array
 * time complexity: O(nlogn + mlogm)
 * space complexity; O(1) or O(n+m) depending on the sorting algorithm
 */
public class ValidAnagram {
    public static void main(String [] args){
        System.out.println(isAnagram("anagram", "aanrgam"));
    }

    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length())
            return false;

        char[] sChars = s.toCharArray();
        char[] tChars = s.toCharArray();

       
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        System.out.println(sChars);
        System.out.println(tChars);
        return Arrays.equals(sChars, tChars);
    }

}

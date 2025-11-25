package neet_code.valid_anagram;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * put each character and quantity to the Map
 * compare two Map
 * time complexity: O(n+m)
 * space complexity: O(1)
 */
public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagramHashMap("anagram", "anagrma"));
        System.out.println(isAnagramCharacterArraySort("anagram", "aanrgam"));
    }

    public static boolean isAnagramHashMap(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0)+ 1);
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0)+ 1);
        }
        return sMap.equals(tMap);
    }

    public static boolean isAnagramCharacterArraySort(String s, String t){
        if(s.length() != t.length())
            return false;
        char[] sChars = s.toCharArray();
        char[] tChars = s.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return Arrays.equals(sChars, tChars);
    }
}

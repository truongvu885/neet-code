package valid_anagram;
import java.util.HashMap;
import java.util.Map;

/**
 * put each character and quantity to the Map
 * compare two Map
 * time complexity: O(n+m)
 * space complexity: O(1)
 */
public class ValidAnagram_HashMap {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "anagrma"));
    }

    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0)+ 1);
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0)+ 1);
        }
        System.out.println(sMap);
        System.out.println(tMap);
        return sMap.equals(tMap);
    }


}

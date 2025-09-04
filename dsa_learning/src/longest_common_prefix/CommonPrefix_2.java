package longest_common_prefix;

public class CommonPrefix_2 {
    public static void main(String[] args) {
//        String[] strs = {"flower","flow","flight"};
//        String[] strs = {"bat","bag","bank","band"};
        String[] strs = {"dance","dag","danger","damage"};
//        String[] strs = {"neet","feet"};
//        String[] strs = {"onlyone"};
//        String[] strs = {"a","a","a"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        for (int i = 0; i < strs[0].length(); i++) {
            for (String s : strs){
                if (i == s.length() || strs[0].charAt(i) != s.charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}

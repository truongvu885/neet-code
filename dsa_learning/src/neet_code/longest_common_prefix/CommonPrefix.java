package neet_code.longest_common_prefix;

public class CommonPrefix {
    public static void main(String[] args) {
//        String[] strs = {"bat","bag","bank","band"};
//        String[] strs = {"dance","dag","danger","damage"};
//        String[] strs = {"neet","feet"};
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefixSubString(strs));
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefixSubString(String[] strs) {
        for (int i = 0; i < strs[0].length(); i++) {
            for (String s : strs){
                if (i == s.length() || strs[0].charAt(i) != s.charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }

    private static String longestCommonPrefix(String[] strs){
        if(strs.length == 1){
            return strs[0];
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            int minLength = strs[0].length();
            if (minLength > strs[i].length()){
                String temp = "";
                temp = strs[0];
                strs[0] = strs[i];
                strs[i] = temp;
            }
        }
        char[] chars_1 = strs[0].toCharArray();
        for (int j = 0 ; j < chars_1.length; j++){
            boolean isCommon = false;
            for(int i = 1 ; i < strs.length ; i++){
                if (chars_1[j] == strs[i].toCharArray()[j]){
                    isCommon = true;
                }
                else
                    isCommon = false;
            }
            if (j==0 && !isCommon){
                return "";
            }
            if (isCommon){
                result.append(chars_1[j]);
            }
        }
        return result.toString();
    }
}

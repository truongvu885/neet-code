package longest_common_prefix;

public class CommonPrefix_1 {
    public static void main(String[] args) {
//        String[] strs = {"bat","bag","bank","band"};
//        String[] strs = {"dance","dag","danger","damage"};
//        String[] strs = {"neet","feet"};
        String[] strs = {"flower","flow","flight"};

        StringBuilder result = new StringBuilder();

//        Arrays.sort(strs);
        for (int i = 0; i < strs.length; i++) {
            int minLength = strs[0].length();
            if (minLength > strs[i].length()){
                String temp = "";
                temp = strs[0];
                strs[0] = strs[i];
                strs[i] = temp;
            }
        }
        for (String s : strs){
            System.out.println(s);
        }

        char[] chars_1 = strs[0].toCharArray();
        for (int j = 0 ; j < chars_1.length; j++){
            boolean isCommon = false;
            for(int i = 1 ; i < strs.length ; i++){
                if (chars_1[j] == strs[i].toCharArray()[j]){
                    isCommon = true;
                }else
                    isCommon = false;
            }
            if (j ==0 && !isCommon){
                break;
            }
            if (isCommon){
                result.append(chars_1[j]);
            }
        }
        System.out.println(result.toString());
    }


}

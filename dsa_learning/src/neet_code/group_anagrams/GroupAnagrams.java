package neet_code.group_anagrams;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"act", "pots", "tops", "cat", "stop", "hat"};
        System.out.println(groupAnagramsUseIntArrayASCIICode(strs));
        System.out.println(groupAnagramsSortCharacterArray(strs));
    }

    public static List<List<String>> groupAnagramsUseIntArrayASCIICode(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String s: strs){
            //use ASCII code
            //[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
            //[a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z]
            int count[] = new int[26];
            for (char c: s.toCharArray()){
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }
        List<List<String>> list = res.values().stream().sorted(Comparator.comparingInt(List::size)).toList();
        return list;
    }

    public static List<List<String>> groupAnagramsSortCharacterArray(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
    }
}

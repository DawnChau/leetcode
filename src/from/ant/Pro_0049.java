package from.ant;

import java.util.*;

public class Pro_0049 {


    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if (map.containsKey(key)) {
                map.get(key).add(strs[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(key, list);
            }
        }
        return new ArrayList<>(map.values());
    }


    // 不是最优解
    public List<List<String>> groupAnagrams1(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            boolean found = false;
            for (int j = 0; j < ans.size(); j++) {
                if (isAnagrams(ans.get(j).get(0), strs[i])) {
                    ans.get(j).add(strs[i]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                ans.add(temp);
            }
        }
        return ans;
    }

    private boolean isAnagrams(String s, String str) {
        if (s.length() != str.length()) {
            return false;
        }
        int[] ch = new int[26];
        for (int i = 0; i < s.toCharArray().length; i++) {
            ch[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < str.toCharArray().length; i++) {
            ch[str.charAt(i) - 'a']--;
            if (ch[str.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(new Pro_0049().groupAnagrams(strs));
    }
}

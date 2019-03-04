import java.util.*;

/**
 * 将相同字母组成的分组
 */
public class Pro_049 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String newStr = new String(temp);
            if (map.containsKey(newStr)) {
                List<String> tempList = map.get(newStr);
                tempList.add(strs[i]);
                map.put(newStr, tempList);
            } else {
                List<String> tempList = new ArrayList<>();
                tempList.add(strs[i]);
                map.put(newStr, tempList);
            }
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            res.add(map.get(it.next()));
        }
        return res;
    }
}

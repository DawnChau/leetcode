package from.ant;

import java.util.*;

public class Pro_0017 {

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0) {
            return new ArrayList<>();
        }

        Map<Character, List<Character>> integerListMap = initMap();

        char[] ch = digits.toCharArray();
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        dfs(ch, res, integerListMap, 0, sb);
        return res;
    }

    private void dfs(char[] ch, List<String> res, Map<Character, List<Character>> integerListMap, int startIndex, StringBuilder sb) {
        // 最后一个
        if (startIndex == ch.length) {
            res.add(sb.toString());
            return;
        }

        List<Character> characters = integerListMap.get(ch[startIndex]);
        for (int j = 0; j < characters.size(); j++) {
            sb.append(characters.get(j));
            dfs(ch, res, integerListMap, startIndex + 1, sb);
            // 回溯
            sb.delete(startIndex, sb.length());
        }
    }

    private Map<Character, List<Character>> initMap() {
        Map<Character, List<Character>> map = new HashMap<>();
        map.put('2', Arrays.asList('a', 'b', 'c'));
        map.put('3', Arrays.asList('d', 'e', 'f'));
        map.put('4', Arrays.asList('g', 'h', 'i'));
        map.put('5', Arrays.asList('j', 'k', 'l'));
        map.put('6', Arrays.asList('m', 'n', 'o'));
        map.put('7', Arrays.asList('p', 'q', 'r', 's'));
        map.put('8', Arrays.asList('t', 'u', 'v'));
        map.put('9', Arrays.asList('w', 'x', 'y', 'z'));
        return map;
    }

    public static void main(String[] args) {
        System.out.println(new Pro_0017().letterCombinations(""));
        System.out.println(1);
    }
}

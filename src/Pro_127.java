import java.util.LinkedList;
import java.util.List;

/**
 * 单词每次改变一个字母
 */
public class Pro_127 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int end = wordList.indexOf(endWord);
        if (end == -1)
            return 0;

        if (!wordList.contains(beginWord)) {
            wordList.add(beginWord);
        }
        int begin = wordList.indexOf(beginWord);

        int n = wordList.size();
        boolean[][] g = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                g[j][i] = g[i][j] = similar(wordList.get(i), wordList.get(j));
            }
        }

        // BFS
        LinkedList<Integer> q = new LinkedList<>();
        int[] step = new int[n];
        q.addLast(begin);
        step[begin] = 1;
        while (!q.isEmpty()) {
            int cur = q.removeFirst();
            for (int i = 0; i < n; i++) {
                // 没有被走过，并且距离为1
                if (step[i] == 0 && g[cur][i]) {
                    if (i == end)
                        return step[cur] + 1;
                    step[i] = step[cur] + 1;
                    q.addLast(i);
                }
            }
        }
        return 0;
    }

    /**
     * 判断差距是否为1
     *
     * @param word1
     * @param word2
     * @return
     */
    private boolean similar(String word1, String word2) {
        if (word1.length() != word2.length() || word1.equals(word2))
            throw new IllegalArgumentException();

        int diff = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                diff++;
                if (diff > 1)
                    return false;
            }
        }
        return true;
    }
}

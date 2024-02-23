package from.ant;

public class Pro_2114 {
    public int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < sentences.length; i++) {
            max = Math.max(countWordsNum(sentences[i]), max);
        }
        return max;
    }

    private int countWordsNum(String sentence) {
        int res = 1;
        for (int i = 0; i < sentence.toCharArray().length; i++) {
            if (sentence.charAt(i) == ' ') {
                res++;
            }
        }
        return res;
    }
}

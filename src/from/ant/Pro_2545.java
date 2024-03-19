package from.ant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Pro_2545 {
    public int[][] sortTheStudents(int[][] score, int k) {
        List<Item2545> items = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            Item2545 item = new Item2545(score[i][k], score[i]);
            items.add(item);
        }
        items.sort(((o1, o2) -> o2.getkScore()-o1.getkScore()));

        int[][] ans = new int[score.length][score[0].length];
        for (int i = 0; i < items.size(); i++) {
            ans[i] = items.get(i).getScore();
        }
        return ans;
    }
}

class Item2545 {

    private int kScore;

    private int[] score;

    public Item2545(int kScore, int[] score) {
        this.kScore = kScore;
        this.score = score;
    }

    public int getkScore() {
        return kScore;
    }

    public void setkScore(int kScore) {
        this.kScore = kScore;
    }

    public int[] getScore() {
        return score;
    }

    public void setScore(int[] score) {
        this.score = score;
    }
}

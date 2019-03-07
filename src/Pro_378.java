import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 有序矩阵中第k个最小的元素
 * 第k个最小的，就是在k个元素里，它是最大的
 */
public class Pro_378 {
    public int kthSmallest(int[][] matrix, int k) {
        // 默认是从小到大
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                // 剪枝
                if((i+1)*(j+1)>k)
                    break;
                maxHeap.add(matrix[i][j]);
                if(maxHeap.size()>k){
                    maxHeap.poll();
                }
            }
        }
        return maxHeap.peek();
    }
}

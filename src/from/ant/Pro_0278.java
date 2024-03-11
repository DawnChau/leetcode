package from.ant;

import java.util.HashSet;
import java.util.Set;

public class Pro_0278 {

    public int firstBadVersion(int n) {
        Set<Integer> falseVersion = new HashSet<>();

        int left = 1;
        int right = n;
        int mid = left + (right - left) / 2;
        boolean badVersion = isBadVersion(mid);
        while (left <= right) {
            if (badVersion && falseVersion.contains(mid - 1)) {
                return mid;
            } else {
                // mid还是false
                if (!badVersion) {
                    falseVersion.add(mid);
                    left = mid + 1;
                } else {
                    // mid是true
                    right = mid - 1;
                }
                mid = left + (right - left) / 2;
                badVersion = isBadVersion(mid);
            }
        }
        return mid;
    }

    boolean isBadVersion(int version) {
        System.out.println("调用"+version);
        if (version == 2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Pro_0278().firstBadVersion(3));
    }
}

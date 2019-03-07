import java.util.Iterator;
import java.util.List;

/**
 * 每个NestedInteger可能是list，也可能 是整形，实现一个迭代器
 */
public class Pro_341 implements Iterator<Integer> {

    private List<NestedInteger> nestedList;
    private int data;

    public Pro_341(List<NestedInteger> nestedList) {
        this.nestedList = nestedList;
    }

    @Override
    public Integer next() {
        return data;
    }

    @Override
    public boolean hasNext() {
        while (nestedList != null && nestedList.size() > 0) {
            // 取出第一个数，返回
            NestedInteger tempInt = nestedList.remove(0);
            if (tempInt.isInteger()) {
                data = tempInt.getInteger();
                return true;
            } else {
                // 把list全部变成整形，添加到nestedList中
                nestedList.addAll(0, tempInt.getList());
            }
        }
        return false;
    }
}

interface NestedInteger {
    public boolean isInteger();

    public Integer getInteger();

    public List<NestedInteger> getList();
}

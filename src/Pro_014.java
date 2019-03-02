public class Pro_014 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        int left = 0;
        int right = strs.length-1;
        return solve(strs,left,right);
    }

    public String solve(String[] strings,int left,int right){
        // 递归退出条件
        if(left == right)
            return strings[left];

        int mid = left + (right-left)/2;
        String leftString = solve(strings,left,mid);
        String rightString = solve(strings,mid+1,right);

        // 比较左右公共子串的公共子串
        int i = 0;
        for(;i<rightString.length();i++){
            if(i>=leftString.length() || leftString.charAt(i)!=rightString.charAt(i))
                break;
        }
        return leftString.substring(0,i);
    }
}

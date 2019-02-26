/**
 * 数数并说出来
 */
public class Pro_038 {
    public static String countAndSay(int n) {
        if(n == 1)
            return "1";
        StringBuilder sb = new StringBuilder("1");

        // 输入的n是几
        for(int j = 1;j<n;j++){
            // 记录left的字符
            char l = sb.charAt(0);
            int count = 0;
            StringBuilder newSb = new StringBuilder();
            // 遍历上一行的字符串
            for(int i = 0;i<sb.length();i++){
                char c = sb.charAt(i);
                // 相等数量加一
                if(c == l){
                    count++;
                }else{
                    // 不想等加到新的字符串中，同时更新left的字符
                    newSb.append(""+count+l);
                    count = 1;
                    l = c;
                }
                // 遍历到最后的时候，加上新的字符
                if(i == sb.length()-1){
                    newSb.append(""+count+l);
                }
            }
            // 这一行字符串变成新的上一行字符串
            sb = newSb;
        }
        return sb.toString();
    }
}

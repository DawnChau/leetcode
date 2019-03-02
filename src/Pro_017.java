import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 根据按键求组合
 */
public class Pro_017 {
    private static HashMap<Character,String> map = new HashMap<>();
    private static List<String> list = new ArrayList<>();
    public static List<String> letterCombinations(String digits) {
        if(digits==null || digits.length()==0)
            return list;
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        // index 按键次数
        StringBuilder sb = new StringBuilder();
        solve(digits,0,sb);
        return list;
    }

    private static void solve(String digits,int index,StringBuilder sb) {
        if(index==digits.length()){
            // 按键次数满了，可以加入
            list.add(sb.toString());
            return;
        }

        char c = digits.charAt(index);
        String s = map.get(c);
        for(int i = 0;i<s.length();i++){
            sb.append(s.charAt(i));
            solve(digits,index+1,sb);
            // 把刚刚加入的删除掉
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}

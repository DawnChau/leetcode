package from.ant;

public class Pro_1678 {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        boolean onlyBrace = false;
        for (int i = 0; i < command.toCharArray().length; i++) {
            char c = command.charAt(i);
            if (c == 'G') {
                sb.append('G');
            } else if (c == '(') {
                onlyBrace = true;
            } else if (c == 'a' || c == 'l') {
                onlyBrace = false;
            } else {
                if(onlyBrace){
                    sb.append('o');
                    onlyBrace = false;
                }else{
                    sb.append('a');
                    sb.append('l');
                }
            }
        }
        return sb.toString();
    }
}

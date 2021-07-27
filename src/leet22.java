import java.util.*;
public class leet22 {
    ArrayList<String> answer;
    public List<String> generateParenthesis(int n) {
        answer = new ArrayList<>();
        func(n, n-1, n, "(");
        return answer;
    }
    public void func(int n, int open, int close, String a){
        if(open == 0 && close == 0){
            answer.add(a);
            return;
        }
        if(open < close){
            func(n, open, close-1, a+")");
        }
        if(open > 0){
            func(n, open-1, close, a+"(");
        }
    }
}

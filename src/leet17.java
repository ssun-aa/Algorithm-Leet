import java.util.*;
public class leet17 {
    List<String> answer;
    public List<String> letterCombinations(String digits) {
        answer = new LinkedList<>();
        String nums[] = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String s="";

        if(digits.equals(""))//digits이 ""이면
            return answer;//빈 리스트 리턴

        func(digits, 0, s, nums);
        return answer;
    }
    public void func(String digits, int n, String s, String nums[]){
        if(s.length() == digits.length()){
            answer.add(s);
            return;
        }
        int index = digits.charAt(n) - '0' - 2;
        for(int i=0; i<nums[index].length(); i++){
            func(digits, n+1 ,s+nums[index].charAt(i), nums);
        }
    }

}

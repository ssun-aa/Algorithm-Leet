import java.util.*;
public class leet77 {
    List<Integer> list;
    public List<List<Integer>> combine(int n, int k) {
        list = new ArrayList<>();
        List<List<Integer>> answer = new LinkedList<>();
        for(int i=1; i<=n; i++){
            list.add(i);
            func(n, k, i, 1, answer);
            list.remove(list.size()-1);
        }
        return answer;
    }
    public void func(int n, int k, int id, int cnt, List<List<Integer>> answer){
        if(cnt == k){
            answer.add(new ArrayList<>(list));
            return;
        }
        for(int i = id+1; i<=n; i++){
            list.add(i);
            func(n, k, i, cnt+1, answer);
            list.remove(list.size()-1);
        }
    }
}

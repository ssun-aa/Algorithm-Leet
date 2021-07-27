import java.util.*;
public class leet39 {
    List<List<Integer>> answer;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        answer = new LinkedList<>();
        int arr[] = new int[501];
        Arrays.sort(candidates);
        func(candidates, target, 0, arr, 0);
        return answer;
    }
    public void func(int[] candidates, int target, int sum, int arr[], int depth){
        if(sum == target){
            List<Integer> list = new LinkedList<>();
            for(int i=0; i<depth; i++){
                list.add(arr[i]);
            }
            answer.add(list);
            return;
        }
        if(sum > target)
            return;
        for(int i=0; i<candidates.length; i++){
            if(depth>0 && candidates[i]<arr[depth-1])
                continue;
            arr[depth] = candidates[i];
            func(candidates, target, sum+candidates[i], arr, depth+1);
        }
    }

}

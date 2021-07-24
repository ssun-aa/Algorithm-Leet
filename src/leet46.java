import java.util.*;
public class leet46 {
    static List<List<Integer>> answer;
    static int arr[];
    static int N;
    static boolean visit[];
    public List<List<Integer>> permute(int[] nums) {
        N = nums.length;
        arr = new int[N];
        visit = new boolean[N];
        answer= new LinkedList<>();
        func(0, nums);
        System.out.println(answer);
        return answer;
    }
    static void func(int index, int nums[]){
        if(index == N){
            List<Integer> list = new LinkedList<>();
            for(int i=0; i<arr.length; i++)
                list.add(arr[i]);
            answer.add(list);
            return;
        }
        for(int i=0; i<N; i++){
            if(!visit[i]){
                arr[index] = nums[i];
                visit[i] = true;
                func(index+1, nums);
                visit[i] = false;
            }
        }
    }
}

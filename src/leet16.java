public class leet16 {
    static int Min;
    static int answer;
    public int threeSumClosest(int[] nums, int target) {
        answer = 0;
        Min = Integer.MAX_VALUE;
        dfs(0, nums, target, 0, 0);
        return answer;
    }
    static void dfs(int depth, int[] nums, int target, int count, int sum){
        if(count == 3){//3번 더 했을 때
            int min = Math.abs(sum - target);//target과의 차이
            if(min < Min){//차이가 가장 적은 경우의 sum 저장
                Min = min;
                answer = sum;
            }
            return;
        }
        if(depth >= nums.length)//nums범위 벗어난 경우
            return;
        dfs(depth+1, nums, target, count, sum);
        dfs(depth+1, nums, target, count+1, sum+nums[depth]);

    }

}

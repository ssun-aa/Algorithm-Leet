public class leet1551 {
    public int minOperations(int n) {
        int answer = 0;
        if(n %2 ==0){
            int i = 1;
            while(i < n){
                answer += i;
                i+=2;
            }
        }
        else{
            int i = 2;
            while(i < n){
                answer += i;
                i+=2;
            }
        }
        return answer;
    }
}

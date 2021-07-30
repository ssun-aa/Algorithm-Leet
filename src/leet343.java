public class leet343 {
    public int integerBreak(int n) {
        int dp[] = new int[60];
        int answer=0;
        if(n == 2)
            return 1;
        else if(n == 3)
            return 2;
        else if(n == 4)
            return 4;

        if(n % 3 == 0){
            int r = n / 3;
            answer = (int) Math.pow(3,r);
        }
        else if(n % 3 == 1){
            int r = n / 3;
            answer = (int) Math.pow(3,r-1) * 4;
        }
        else if(n % 3 == 2){
            int r = n / 3;
            answer = (int) Math.pow(3,r) * 2;
        }
        return answer;
    }
}

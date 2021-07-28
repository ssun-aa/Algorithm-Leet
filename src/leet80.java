public class leet80 {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int answer = 0;
        for(int i=0; i<nums.length; i++){
            count = 1;
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    if(count >= 2)//같은 숫자가 이미 2개 이상이면 변경
                        nums[j] = Integer.MIN_VALUE;
                    count++;
                }
                else
                    break;
            }
        }
        for(int i=nums.length-1; i>0; i--){//뒤에서 부터
            if(nums[i] == Integer.MIN_VALUE){//MIN_VALUE 공간의 경우
                for(int j=i; j<nums.length-1; j++){//뒤에 숫자 끌어와서 MIN을 가장 뒤로 보내기
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for(int i: nums){
            if(i > Integer.MIN_VALUE)
                answer++;
        }
        return answer;
    }
}

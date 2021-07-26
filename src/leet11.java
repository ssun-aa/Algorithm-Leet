public class leet11 {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int max = Math.min(height[i],height[j]) * (j-i);

        while(i<j){
            if(height[i] <= height[j])
                i++;
            else
                j--;
            max = Math.max(max, Math.min(height[i],height[j]) * (j-i));
        }
        return max;
    }
}

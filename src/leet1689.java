public class leet1689 {
    public int minPartitions(String n) {
        int max = 0;
        for(int i=0; i<n.length(); i++){
            String num = n.charAt(i)+"";
            if(max < Integer.parseInt(num)){
                max = Integer.parseInt(num);
            }
        }
        return max;
    }
}

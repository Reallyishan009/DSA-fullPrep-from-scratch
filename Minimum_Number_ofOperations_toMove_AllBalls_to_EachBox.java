import java.util.Arrays;

class Solution {
    public static int[] minOperations(String boxes) {
        
        int n = boxes.length();
        int result[] = new int[n];

        for(int i =0;i<n;i++){
            int operations = 0;
            for(int j =0; j<n ;j++){
                if(boxes.charAt(j)=='1'){
                    operations+= Math.abs(i-j);
                }
            }
            result[i] = operations;
        }

        return result;
    }

    public static void main(String[] args) {
        String boxes = "001011";
       System.out.println(Arrays.toString(minOperations(boxes)));

    }
}
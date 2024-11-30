public class grant6 {
    public static void main(String[] args) { //Sum Square Difference
        int sqaureNum = 0;
        int sqaureSum = 0;
        for(int i = 1; i <= 100; i++){
            sqaureNum = sqaureNum + (int)Math.pow(i,2);
        }
        for(int i = 1; i <= 100; i++){
            sqaureSum = sqaureSum + i;
        }
        sqaureSum = (int)Math.pow(sqaureSum, 2);
        System.out.println(sqaureSum - sqaureNum);
    }
}

public class grant12 {
    public static void main(String[] args) { //Highly Divisible Triangular Number
        long mainNum = 0;
        int triNum = 1;
        int divisors = 0;
        while (divisors < 500){
            mainNum = 0;
            mainNum = (long) triNum * (triNum + 1) / 2;
            for (int i = 1; i <= Math.sqrt(mainNum); i++) {
                if (mainNum % i == 0) {
                    divisors++;
                    if (i != mainNum / i) {
                        divisors++; 
                    }
                }
            }
            if (divisors >= 500) {
                break;
            } else{
                divisors = 0;
                triNum++;
            }
        }
        System.out.println(triNum);
        System.out.println(mainNum);
    }
}

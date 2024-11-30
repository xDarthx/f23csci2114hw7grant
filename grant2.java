
public class grant2 {
    public static void main(String[] args) { //Even Fibonacci Numbers
        int num1 = 0, num2 = 1, sum = 0;;
        boolean n = false;
        while(n == false){
            if(num2 < 4000000){
                int num3 = num2 + num1;
                num1 = num2;
                num2 = num3;
                if(num3 % 2 == 0){
                    sum += num3;
                }
            } else {
                n = true;
            }
        }
        System.out.print("Sum: " + sum);
    }
}

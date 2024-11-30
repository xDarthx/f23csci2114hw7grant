
import java.math.BigInteger;

public class grant16 { // Power Digit Sum
    public static void main(String[] args) {
        BigInteger powerNum = BigInteger.valueOf(2).pow(1000);
        String powString = powerNum.toString();
        int sum = 0;
        for (int i = 0; i < powString.length(); i++) {
            sum += Character.getNumericValue(powString.charAt(i));
        }
        System.out.println(sum);
    }
}


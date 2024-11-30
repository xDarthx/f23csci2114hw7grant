public class grant10 {
    public static void main(String[] args) { //Summation of Primes
        // I wont lie I legit had to look up why the answer was wrong and it was because I had it set 
        // to int instead of long so it capped at 1179908154 XD
        long sum = 2;
        int index = 3;

        while (index < 2000000) {
            boolean isPrime = true;
            for (int i = 3; i <= Math.sqrt(index); i +=2) {
                if (index % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += index;
            }
            index += 2;
        }
        System.out.println(sum);
    }
}

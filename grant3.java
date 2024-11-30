
public class grant3 {
    public static void main(String[] args) { //Largest Prime Factor
        long number = 600851475143L;
        long primeNum = 0;
        
        for (long i = 2; i * i <= number; i++) {
            while (number % i == 0) {
                primeNum = i;
                number /= i; 
            }
        }
        if (number > 1) {
            primeNum = number;
        }

        System.out.println(primeNum);
    }
}

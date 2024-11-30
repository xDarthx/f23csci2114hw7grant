public class grant7 {
    public static void main(String[] args) { //10001st Prime Num
        int found = 0;
        int index = 2;

        while (found < 10001) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(index); i++) {
                if (index % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                found++;
            }
            if(found == 10001){
                break;
            }
            index++;
        }
        System.out.println(index);
    }
}

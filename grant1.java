
public class grant1 {
    public static void main(String[] args) { //Multiples of 3 or 5
        int index = 1000;
        int sum = 0;
        for (int i = 0; i < index; i++){
            if( i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
            System.out.println(sum);
    }
}

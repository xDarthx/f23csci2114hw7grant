public class grant9 {
    public static void main(String[] args) { //Special Pythagorean Triplet
        for (int a = 1; a < 1000; a++) {
            for (int b = a; b < 1000 - a; b++) {
                int c = 1000 - a - b;
                if (a * a + b * b == c * c) {
                    System.out.println(a * b * c);
                }
            }
        }
    }
}

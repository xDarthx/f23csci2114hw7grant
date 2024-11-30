
public class grant4 {
    public static void main(String[] args) { //Largest Palindrome Product
        int mainNum = 0;
        for (int i = 1; i < 999; i++) {
            for (int j = 1; j < 999; j++) {
                String curNum = Integer.toString(i * j);
                if (curNum.length() % 2 == 0) {
                    String cLeft = curNum.substring(0, curNum.length() / 2);
                    String cRight = curNum.substring(curNum.length() / 2);
                    String cRightReversed = new StringBuilder(cRight).reverse().toString();
                    if (cLeft.equals(cRightReversed) && mainNum < Integer.parseInt(curNum)) {
                        mainNum = Integer.parseInt(curNum);
                    }
                }
            }
        }
        System.out.println(mainNum);
    }
}

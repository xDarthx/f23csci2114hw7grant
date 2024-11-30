public class grant14 {
    public static void main(String[] args) { //Longest Collatz Sequence
        long mainNum = 13;
        long mainNum2 = 13;
        int chainCount = 0;
        int chainCount2 = 0;
        while (mainNum2 < 1000000) {
            mainNum2++;
            long testNum = mainNum2;
            chainCount2 = 0;
            do{
                if(testNum % 2 == 0){
                    testNum = testNum / 2;
                } else{
                    testNum = 3 * testNum + 1;
                }
                chainCount2++;
            }while(testNum != 1);
            if (chainCount2 > chainCount) {
                
                chainCount = chainCount2;
                mainNum = mainNum2;
            }
        }
        System.out.println(mainNum);
        System.out.println(chainCount);
    }
}

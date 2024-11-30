public class grant5 {
    public static void main(String[] args) { //Smallest Multiple
        int index = 20;
        double mainNum = 0;
        int count = 0;
        boolean itIsTime = false;
        while(!itIsTime){
            for(int i = 1; i <=20; i++){
                if(index % i == 0){
                    mainNum = index / i;
                    if(mainNum == (int)mainNum){
                        count++;
                    }
                }
            }
            if(count == 20) {
                itIsTime = true;
                break;
            } else{
                count = 0;
                index++;
            }
        }
        System.out.println(index);
    }
}

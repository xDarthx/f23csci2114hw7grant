
public class grant17 { //Number Letter Counts

    private static final String[] ones = {
        "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", 
        "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", 
        "seventeen", "eighteen", "nineteen"
    };
    
    private static final String[] tens = {
        "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    public static void main(String[] args) {
        int total = 0;
        for(int i = 1; i < 1001; i++){
            String temp = convertToLetter(i);
            temp = temp.replaceAll("\\s+", "");
            total += temp.length();
        }
        System.out.println(total);
    }

    public static String convertToLetter(int n){
        if(n == 1000){
            return("one thousand");
        }

        String words = "";

        if (n >= 100) {
            words += ones[n / 100] + " hundred";
            n %= 100;
            if (n > 0) {
                words += " and ";
            }
        }

        if (n >= 10 && n < 20) {
            words += ones[n];
        } else if (n >= 20) {
            words += tens[n / 10];
            n %= 10;
            if (n > 0) {
                words += " " + ones[n];
            }
        } else if (n > 0) {
            words += ones[n];
        }

        return words;
    }
}

import java.util.Scanner;

public class Warmup {
        /*
       public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //for first function
         String sent=sc.nextLine();
        int num = sc.nextInt();
        System.out.println(wordFinder(sent , num));

        //for secomd function
        String number=sc.nextLine();
        boolean search=sc.nextBoolean();
        System.out.println(oddEvenCounter(number,search));

        //for third function
        String worda=sc.nextLine();
        String wordb=sc.nextLine();
        System.out.println(firstWord(worda,wordb));


    }*/
    public static String wordFinder(String sentence, int number) {
        int size=1;
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)==' ') size++;
        }
        String[] str=sentence.split(" ",size);
        if(size<number){
            return "Number = "+number+" is out Of Bound";
        }else{
            return str[number-1];
        }
    }

    public static int oddEvenCounter(String number, boolean searchForEven) {
        int even=0;
        int odd=0;
        for(int i=0;i<number.length();i++){
            if(number.charAt(i)%2==0){
                even++;
            }else {
                odd++;
            }
        }
        if(searchForEven){
            return even;
        }else {
            return odd;
        }
    }

    public static String firstWord(String wordA, String wordB) {
        if(wordB.length()<wordA.length()){
            String t;
            t=wordA;
            wordA=wordB;
            wordB=t;
        }
        String ans="test";
        for (int i = 0; i < wordA.length(); i++) {
            if (wordB.charAt(i) > wordA.charAt(i)) {
                ans = wordA;
                break;
            } else if (wordB.charAt(i) == wordA.charAt(i)) {
                continue;
            }else if(wordB.charAt(i)<wordA.charAt(i  )){
                ans = wordB;
                break;
            }
        }
        return ans;
    }
}

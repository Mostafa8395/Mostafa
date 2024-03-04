
import java.util.Scanner;

public class Advanced {
   /*
   public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //for first method
        String sentence=sc.nextLine();
        String w1=sc.nextLine();
        String w2=sc.nextLine();
        System.out.println(wordCensor(sentence,w1,w2));

        //for second method
        String w1=sc.nextLine();
        String w2=sc.nextLine();
        System.out.println(normalizingName(w1,w2));

        //for third function
        String w1=sc.nextLine();
        System.out.println(doubleChar(w1));
    }
    */

    public static String wordCensor(String sentence, String word, String newWord){

        int space=1;
        for(int i=0;i< sentence.length();i++){
            if(sentence.charAt(i)== ' '){
                space++;
            }
        }
        String[] str= sentence.split(" " , space );
        for(int j=0;j<space;j++){
            if(str[j].equals(word)){
                str[j]=newWord;
            }
        }
        String newstr="";
        for(int k=0;k<space;k++){
            newstr+=str[k]+' ';
        }
        return newstr;
    }

    public static String normalizingName(String firstName, String lastName){
        firstName=firstName.toLowerCase();
        lastName=lastName.toLowerCase();
        char[] fname=firstName.toCharArray();
        char[] lname=lastName.toCharArray();
        fname[0]-=32;
        lname[0]-=32;
        String fainal="";
        for(int i=0;i<firstName.length();i++){
            fainal+=fname[i];
        }
        fainal+=' ';
        for (int j=0;j<lastName.length();j++){
            fainal+=lname[j];
        }
        return fainal;
    }
    public static String doubleChar(String word) {
        char[] w1=word.toCharArray();
        for(int i=0;i<word.length()-1;i++){
            if(w1[i]==w1[i+1]){
                w1[i]='.';
            }
        }
        String fainal="";
        for(int j=0;j<word.length();j++){
            if(w1[j]!='.'){
                fainal+=w1[j];
            }
        }
        return fainal;
    }
}


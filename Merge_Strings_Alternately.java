import java.util.Scanner;

public class Merge_Strings_Alternately {

    public  static void mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int n1 = word1.length();
        int n2 = word2.length();
        int i = 0;

        while(i < n1 || i < n2) {
            if(i < n1) {
                sb.append(word1.charAt(i));
            }

            if (i < n2) {
                sb.append(word2.charAt(i));
            }
            i++;
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        
        mergeAlternately(word1, word2);
    }
}
import java.util.Scanner;
public class vowelscons {
    public static void main(String[]args){
            Scanner sc = new Scanner (System.in);
            String str = sc.nextLine();
            char arr[]=str.toCharArray();
            for(int i=arr.length-1;i>=0;i--){
                char ch = str.charAt(i);
                if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                        System.out.println("Vowel: " + ch);
                    } else {
                        System.out.println("Consonant: " + ch);
                    }
                }
            }
        }
    }

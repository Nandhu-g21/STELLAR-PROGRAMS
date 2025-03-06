import java.util.Scanner;
public class vowel {
	public static void main(String[]args)
    {
	
        Scanner sc=new Scanner(System.in);
        char y=sc.next().charAt(0);
		if (y == 'a' || y == 'e' || y == 'i' || y == 'o'
			|| y == 'u') 
			System.out.println("It is a Vowel."); 
		else
			System.out.println("It is a Consonant."); 
    }
	} 

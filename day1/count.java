import java.util.Scanner;

public class count {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		if(n==0) {
		System.out.println("count =0");
		}
		while(n!=0) {
			n=n/10;
			count++	;
		}
System.out.println(count);
	}
}


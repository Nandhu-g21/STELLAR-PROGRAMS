import java.util.Scanner;
public class mirrorrightangle {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
            System.out.print(" ");
        }
            for(int k=1;k<=i;k++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;
public class pyramid {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        for( i=0;i<n;i++){
            System.out.println("* ");
        }
        for(int j=0;j<n;j--){
            System.out.println("");
        }
        for(int k=0;k<=i;k++){
            System.out.println("");
        }
    }
}

import java.util.Scanner;
public class maxmin {
   public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int min=0;
    int max=arr[0];
    for(int i=1;i<n;i++){
        if(max<arr[i])
        {
            max=arr[i];
        }
        else if(min>arr[i]){
            min=arr[i];
        }
    }
    System.out.println(min);
    System.out.println(max);
   }
}

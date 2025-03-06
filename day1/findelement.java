import java.util.Scanner;
public class maxmin {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        int tar=sc.nextInt();
        for(int i=0;i<arr.length;i++){
         arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
if(tar==arr[i]){
    System.out.println("index position is " + i);
    return;
}
        }
       System.out.println("NOT FOUND");
        }
    }
       
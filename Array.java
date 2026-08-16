import java.util.Scanner;
public class Array{
  public static void man(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    sumofarray(arr,n);
  }
  static void sumofarray(int arr[],int n){
    int sum=0;
    for(int i=0;i<n;i++){
      sum=sum+arr[i];
    }
    System.out.println(sum);
  }
}

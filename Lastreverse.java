import java.util.Scanner;
public class Lastreverse{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    last(n,arr);
  }
  static void last(int n,int arr[]){
    int start=(n/2);
    int end=n-1;
    while(start<end){
      int t=arr[start];
      arr[start]=arr[end];
      arr[end]=t;
      start++;
      end--;
    }
    for(int i=0;i<n;i++){
      System.out.println(arr[i]+" ");
    }
  }
}

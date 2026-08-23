import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int k=sc.nextInt();
    rotatesearch(n,arr,k);
  }
  static void rotatesearch(int n,int arr[],int k){
    while(k>0){
      int first=arr[0];
      for(int i=0;i<n-1;i++){
        arr[i]=arr[i+1];
      }
      arr[n-1]=first;
      k--;
    }
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
}

import java.util.Scanner;
public class Sorted{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    sortcheck(n,arr);
  }
  static void sortcheck(int n,int arr[]){
    for(int i=0;i<n-1;i++){
      if(arr[i]>arr[i+1]){
        System.out.println("not sorted");
        return;
      }
    }
    System.out.println("sorted");
  }
}
      

import java.util.Scanner;
public class Minimum{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    minimum(n,arr);
  }
  static void minimum(int n,int arr[]){
    int min=arr[0];
    int index=0;
    for(int i=0;i<n;i++){
      if(min>arr[i]){
        min=arr[i];
        index=i;
      }
    }
    System.out.println(min);
  }
}

import java.util.Scanner;
public class Absolute{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    absolutedifference(n,arr);
  }
  static void absolutedifference(int n,int arr[]){
    int even=0;
    int odd=0;
    for(int i=0;i<n;i++){
      if(arr[i]%2==0){
        even+=arr[i];
      }
      else{
        odd+=arr[i];
      }
      System.out.println(Math.abs(even-odd));
    }
  }
}

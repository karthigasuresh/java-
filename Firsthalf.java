import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    firstarray(n,arr);
  }
  static void firstarray(int n,int arr[]){
    int start=0;
    int end=(n/2)-1;
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
  }
}

import java.util.Scanner;
public class checkeven{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int numbers=sc.nextInt();
    if(numbers%2==0){
      System.out.println("even");
    }
    else{
      System.out.println("odd");
    }
  }
}

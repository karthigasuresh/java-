import java.util.Scanner;
public class reverseeachdigit{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    digit(number);
  }
  static void digit(int n){
    while(n!=0){
      int rem=n%10;
      System.out.println(rem);
      n/=10;
    }
  }
}

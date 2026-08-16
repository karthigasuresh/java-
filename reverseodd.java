import java.util.Scanner;
public class reverseodd{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    odd(n);
  }
  static void odd(int n){
    while(n!=0){
      int digit=n%10;
      if(digit%2!=0){
        System.out.println(digit);
      }
      n/=10;
    }
  }
}
      

import java.util.Scanner;
public class reversecount{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    count(number);
  }
  static void count(int n){
    int count=0;
    while(n!=0){
      count++;
      n/=10;
    }
    System.out.println(count);
  }
}
    

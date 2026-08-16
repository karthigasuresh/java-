import java.util.Scanner;
public class palindrome{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int numbers=sc.nextInt();
    palindromecheck(numbers);
  }
  static void palindromecheck(int n){
    int rev=0;
    int org=n;
    if(n!=0){
      int rem=n%10;
      rev=rev*10+rem;
      n/=10;
    }
    if(rev==org){
      System.out.println("YES");
    }
    else{
      System.out.println("NO");
    }
  }
}
      
    

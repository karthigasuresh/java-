import java.util.Scanner;
public class divisible{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    if(number%5==0&&number%11==0){
      System.out.println("YES");
    }
    else{
      System.out.println("NO");
    }
  }
}
